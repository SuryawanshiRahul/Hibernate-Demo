package com.infogalaxy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.entity.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(Students.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	Students students = session.get(Students.class,1 );
    	System.out.println(students.toString());
    	session.beginTransaction();
    	students.setName("php");
    	students.setFees(1234);
    	session.update(students);
    	session.getTransaction().commit();
    	System.out.println("Data Updated Sucessfully");
    }
}
