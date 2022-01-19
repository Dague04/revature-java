package com.dague;

import com.dague.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ctx.getBean("bean");

        HelloBean helloBean = (HelloBean)ctx.getBean("bean");
        HelloBean otherBean = (HelloBean)ctx.getBean("bean");

        System.out.println(helloBean.getSlno() + " " + helloBean.getName());

        if (helloBean == otherBean) {
            System.out.println("Single bean");
        }
        else {
            System.out.println("Different beans");
        }
    }
}
