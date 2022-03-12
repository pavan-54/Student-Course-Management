package com.pack1;
/**
 * @author PAVAN
 * This is main template for this small project
 */
import java.util.Scanner; 
// importing the scanner class for the input functions

public class Main { // main class

	public static void main(String[] args) { // main method
		
		// Creating a Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("how many students do you want to enroll: ");
		// Ask how many users you want to add
		int nostudents = sc.nextInt();
	  
		Student [] students = new Student[nostudents];
				// Create a n number of students
		for(int i=0;i<nostudents;i++) {// running loop
			students[i] = new Student();
			students[i].Enroll();
			students[i].paytut();
			
		}
		for(int i=0;i<nostudents;i++) {
			students[i].stat();
		}
		sc.close();
		
	}

}

