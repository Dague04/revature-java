package com.dague;

import com.dague.beans.Calculator;
import com.dague.beans.Employee;
import com.dague.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo1Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Springbootdemo1Application.class, args);
        EmployeeController controller = ctx.getBean(EmployeeController.class);
        Employee empSaved = controller.save(new Employee("Sam", 45));
        System.out.println(empSaved);


//        Calculator calc = ctx.getBean(Calculator.class);
//        int sum = calc.add(2,5);
//        System.out.println("The sum is: "+sum);



    }


}
