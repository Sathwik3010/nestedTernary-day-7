package com.codegnan.operators;

import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income");
		int income = sc.nextInt();
		
		double taxAmount = (income<300000)? income*0.05 : (income>=300000 && income<=1000000)? income*0.10:income*0.15 ;
		
		taxAmount += (income>2000000)? (taxAmount*0.01): 0;
		
		System.out.println("\n--- Tax Details ---");
        System.out.println("Income: ₹" + income);
		System.out.println("Total Tax Payable: "+taxAmount);
		sc.close();
	}

}
