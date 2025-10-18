package com.codegnan.operators;

import java.util.Scanner;

public class Age_category {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		
		String grouping = (age>=12 && age<=19)? "Tennager":
			(age>=20 && age<=64)? "Adult": 
				(age>=65)?"Senior":"enter age from 12 to  65 and above";
		System.out.println(grouping);
		sc.close();
	}

}
