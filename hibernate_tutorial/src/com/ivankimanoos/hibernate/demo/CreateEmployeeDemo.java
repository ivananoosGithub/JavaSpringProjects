package com.ivankimanoos.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ivankimanoos.hibernate.demo.entity.Employee;
import com.ivankimanoos.hibernate.demo.entity.Student;

public class CreateEmployeeDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Employee.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			
			System.out.println("Creating new employee object....");
			Employee tempEmployee = new Employee("Ivan Kim", "Anoos", "Google");

			// start transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the employee....");
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
