package com.acadglid.java.core.session2.assignment1;

import java.util.Scanner;

public class ValidateAge {

	private static Scanner s;

	static void validateAge(int age){
		if (age >=18){
			System.out.println("You are eligible to vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner(System.in);
		System.out.println("Enter your age inn years");
		int age=(int)s.nextDouble();
		validateAge(age);

	}

}
