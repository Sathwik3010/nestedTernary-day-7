package com.codegnan.operators;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours to park and vehicle(24 hrs format): ");
		int hours=sc.nextInt();
		int fee=(hours<=3)?(hours*2):(3*2+(hours-3)*1);
		System.out.println(fee);
		sc.close();
	}

}
