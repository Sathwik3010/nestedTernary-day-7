package com.codegnan.operators;

import java.util.Scanner;
public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		String result =(number>0)? "Is positive": (number<0)? "Is Negative" : "Is zero";
		System.out.println(result);
		sc.close();
	}

}
