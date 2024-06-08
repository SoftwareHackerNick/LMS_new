package com.library.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP");
		EntityManager em = emf.createEntityManager();

		int flag = 1;

		while (flag != 0) {

			System.out.println("1.Insert Data.");
			System.out.println("2.Update Data.");
			System.out.println("3.Find Data.");
			System.out.println("4.Delete Data.");
			System.out.println("5.Exit.");
			System.out.println("Enter your choise: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				em.getTransaction().begin();
		    	
		    	Student std1 = new Student(101,"Nikhil","Pune","WIT");
		    	Student std2 = new Student(102,"Mahima","Pune","WIT");
		    	Student std3 = new Student(103,"Rohan","Pune","WIT");
		    	Student std4 = new Student(104,"Shruti","Pune","WIT");
		    	
		    	em.persist(std1);
		    	em.persist(std2);
		    	em.persist(std3);
		    	em.persist(std4);
		    	
		    	List<Student> list = new ArrayList<>();
		    	
		    	list.add(std1);
		    	list.add(std2);
		    	list.add(std3);
		    	list.add(std4);
		    	
		    	Library obj = new Library(111,"WIT","IT",list);
		    	em.persist(obj);
		    	
		    	em.getTransaction().commit();
		    	System.out.println("Data inserted...");
				break;
			}
			
			case 2: {

				em.getTransaction().begin();
				
				System.out.println("Enter Id to update..");
				int ID = sc.nextInt();
				Student st = em.find(Student.class, ID);
				
				System.out.println("Enter new college name..");
				String collegename = sc.next();
				st.setCollege(collegename);

		    	em.persist(st);
		    	
		    	em.getTransaction().commit();
		    	System.out.println("Data Updated...");
				break;
			}

			case 5: {
				flag = 0;
				continue;
			}
			default: {
				System.out.println("Invalid Input.");
			}
			}

			System.out.println("Do you want to continue Enter Y else N");
			String str = sc.next();

			if (str.equals("Y")) {

			} else {
				flag = 0;
			}
		}

		System.err.println("Application is closed..");

	}
}
