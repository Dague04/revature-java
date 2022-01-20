package com.dague.app;

import com.dague.Employee;
import com.dague.controller.SaverController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {

        Employee employee = new Employee(101, "Jane", "Doe", 8);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = ctx.getBean(SaverController.class);
        controller.save(employee);
    }
}
