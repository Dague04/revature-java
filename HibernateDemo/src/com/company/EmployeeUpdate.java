package com.company;

import com.company.beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class EmployeeUpdate {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        // Modifying an existing record
        Transaction transaction = session.beginTransaction();
        Employee employee = session.find(Employee.class, 2);
        employee.setFirstName("Stewart");
        employee.setLastName("Vargas");
        employee.setFirstName("Joe");

        transaction.commit();

    }
}
