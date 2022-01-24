package com.dague.controller;

import com.dague.beans.Employee;
import com.dague.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public Employee save(Employee employee) {
        return employeeService.saveEmployee(employee);
    }


}
