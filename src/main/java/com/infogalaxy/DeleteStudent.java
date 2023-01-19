package com.infogalaxy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.entity.Students;

public class DeleteStudent {
		public static void main(String[] args) {
			//step 1 : Create Configration Obejct And Call configure()
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Students.class);
			
			//Step 2 : Create SessionFactory Object using Configuration Object
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			
			
			// Step3 : Create Session Object using SessionFactory Object
			Session session = sessionFactory.openSession();
			
			
			//Step 4 : perform  oprations using session object
			session.beginTransaction();
			
			Students students = new Students();
			students.setId(105);
			students.setName("Android");
			students.setFees(8000);
			session.save(students);
			session.getTransaction().commit();
			
			System.out.println("Data Saved Successfully....");
		}
}
