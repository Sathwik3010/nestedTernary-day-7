package com.codegnan.operators;

import java.util.Scanner;

public class CalcRemainingAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Amount");
		double purchaseAmount = sc.nextDouble();
		double discount = (purchaseAmount>100)? 0.2: (purchaseAmount >=50) ? 0.1 : 0.0;
	
		double discountAmount = purchaseAmount*discount;
		double remainingAmount = purchaseAmount-discountAmount;
		double percentDiscount = discount * 100;
		System.out.println("Amount after applying "+percentDiscount + "% discout is " +remainingAmount );
		System.out.println("Discount applied: "+ discountAmount );
		sc.close();
	}

}
