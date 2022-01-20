package com.dague.app;

import com.dague.beans.Employee;
import com.dague.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Employee employee = new Employee("Tom", 2);

        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        System.out.println("Saving employee: "+employee);
        Employee savedEmployee = employeeService.save(employee);
        System.out.println("Saved employee: "+savedEmployee);
        System.out.println("Employee saved succesfully!");
    }
}