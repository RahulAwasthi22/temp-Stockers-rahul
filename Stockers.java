package com.rahulawasthi.main;

import com.rahulawasthi.module1.*;
import com.rahulawasthi.module2.*;

import java.util.Scanner;

public class Stockers {
	private static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
// Get number of companies from user
		System.out.println("Enter the no of Comapanies :");
		int size = sc.nextInt();
		double stockPrice [] = new double[(int) size];
		boolean value [] = new boolean[(int) size];
// Get the stock price from user
		for(int i=1; i< size; i++) {
			System.out.println("Enter the Stock Price of Company : " +i);
			stockPrice [i]= sc.nextDouble();
			System.out.println("Whether Comapny's Stock price rose today compare to Yesterday ? ");
			value[i] = sc.nextBoolean();
			
		}
// Get the choice from user to perform the operation.
		System.out.println("-----------------------------");
		System.out.println("Enter the opration you want to Perform :");
		System.out.println("1. Display the companies stock price in ascending order.");
		System.out.println("2. Display the companies stock price in descending order.");
		System.out.println("3. Display the total number of compaines for which Stock price rose today.");
		System.out.println("4. Display the total number of compaines for which Stock price declined today.");
		System.out.println("5. Search a Specific Stock Price.");
		System.out.println("3. Press 0 to exit.");
		
	   	int Choice = sc.nextInt();
		
		switch(Choice) {
		
		case 1:
			 Ascending asc = new Ascending();
			 System.out.println("Elements of array sorted in ascending order: ");    
		            
		            
			break;
		
		case 2:
			Decending dec = new Decending();
			 System.out.println("Elements of array sorted in descending order: ");  
			break;
			default:
		
			
		}
		
		
	}

}