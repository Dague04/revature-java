package com.dague.service;


import com.dague.beans.Employee;
import com.dague.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    public void setEmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }


    public Employee find(int id) {
        return employeeRepo.findById(id).get();
    }


    public List<Employee> findAll() {
        return (List<Employee>) employeeRepo.findAll();
    }


    public void delete(int id) {
        employeeRepo.deleteById(id);
    }
}