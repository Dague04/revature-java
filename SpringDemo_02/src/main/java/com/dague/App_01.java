package com.dague;


import com.dague.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Person person = ctx.getBean(Person.class);

        System.out.println(person.getAddress().getFullAddress());

    }
}
