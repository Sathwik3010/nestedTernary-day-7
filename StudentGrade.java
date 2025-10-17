package com.codegnan.operators;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mraks of Student");
		int marks = sc.nextInt();
		
		char Grade = (marks>=90)? 'A':
						(marks<=89 && marks>=80)? 'B':
							(marks<=79 && marks>=70)? 'C':
								(marks<=69 && marks>=60)?'D':
									(marks<=59 && marks>=50)?'E':'F';

		System.out.println("The Grade of the Student is "+Grade);
		sc.close();
	}

}
