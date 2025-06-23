package com.java.Array;

import java.util.Scanner;

public class DevisorDescending {
	
	public static void printDivisor(int num) {
		for(int i=num;i>=1;i--) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome!");
		System.out.println("This program allows you to enter positive no.");
		System.out.println("You can repeat the process as many time u want");
		System.out.println("-----------------------------------------");
		
		boolean continueProgram=true;
		while(continueProgram) {
			int num;
			while(true) {
				System.out.println("Enter the positive num");
				num=sc.nextInt();
				
				if(num>0) {
					break;
				}
				else {
					System.out.println("Invalid input! Please enter a Positive Number");
				}
			}
			
			printDivisor(num);
			System.out.println("Would you like to enter another number?(yes/no):");
			String answer=sc.next().toLowerCase();
			
			if(!answer.equals("yes")&& !answer.equals("y")) {
				continueProgram=false;
				System.out.println("Thankyou for using the program");
			}
			
			System.out.println("----------------------------------");
		}
		
	}
}
