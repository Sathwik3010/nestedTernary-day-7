package com.codegnan.operators;
import java.util.Scanner;

public class Discountcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to be paid");
		double amount = sc.nextDouble();
	
		double discount = (amount>=1000)? amount*0.20 : (amount>=500 && amount<=999)? amount*0.10 :  0;
		
        double finalAmount = amount - discount;

        System.out.println("\n--- Bill Summary ---");
        System.out.println("Total Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);		
        sc.close();
		
	}

}
