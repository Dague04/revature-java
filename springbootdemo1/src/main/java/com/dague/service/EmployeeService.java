package com.dague.service;

import com.dague.beans.Employee;
import com.dague.exception.EmployeeNotFoundException;
import com.dague.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee findEmployeeBy(int id) throws EmployeeNotFoundException {
        Optional<Employee> empOptional = employeeRepo.findById(id);
        if(!empOptional.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with given ID: "+id);
        }
        return empOptional.get();
    }


    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }


    public Employee saveEmployee(Employee employee)  {
        return employeeRepo.save(employee);
    }


    public Employee editEmployee(Employee employee) throws EmployeeNotFoundException {
        Optional<Employee> empOptional = employeeRepo.findById(employee.getId());
        if(!empOptional.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with given ID: "+employee.getId());
        }
        return employeeRepo.save(employee);
    }


    public Employee deleteEmployee(int id) throws EmployeeNotFoundException {
        Optional<Employee> empOptional = employeeRepo.findById(id);
        if(!empOptional.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with given ID: +id");
        }
        Employee employee = empOptional.get();
        employeeRepo.deleteById(id);
        return employee;
    }
}
