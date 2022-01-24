package com.dague;

import com.dague.beans.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo1Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Springbootdemo1Application.class, args);
        Calculator calc = ctx.getBean(Calculator.class);
        int sum = calc.add(2,5);
        System.out.println("The sum is: "+sum);


    }


}
