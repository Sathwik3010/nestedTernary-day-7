package com.codegnan.operators;

import java.util.Scanner;
public class AccountStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
		int balance = sc.nextInt();
		
		String status = (balance>=1000)? "Good Standing":(balance>=500 && balance<=999)? "Low Balance":"Account Overdrawn";
		
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Balance: $" + balance);
        System.out.println("Status: " + status);
		sc.close();
	}

}
