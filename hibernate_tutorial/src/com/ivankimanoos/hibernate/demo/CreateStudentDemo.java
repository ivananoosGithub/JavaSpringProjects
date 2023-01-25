package com.ivankimanoos.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ivankimanoos.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			
			System.out.println("Creating new student object....");
//			Student tempStudent = new Student("Ivan Kim", "Anoos", "ivankimanoos@gmail.com");
//			Student tempStudent1 = new Student("HAHAHAH", "An123123oos", "ivankimanoos@gmail.com");
//			Student tempStudent2 = new Student("GGGG", "GGG", "ivankimanoos@gmail.com");

			// start transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student STUDENTS where STUDENTS.firstName='HAHAHAH'").getResultList();
			
			// display students
			
			for (Student hahaStudents: theStudents) {
				System.out.println(hahaStudents);
			}
			
			// save the student object
			System.out.println("Saving the student....");
//			session.save(tempStudent);
//			session.save(tempStudent1);
//			session.save(tempStudent2);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
