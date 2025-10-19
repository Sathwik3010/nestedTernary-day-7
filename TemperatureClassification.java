package com.codegnan.operators;

import java.util.Scanner;
public class TemperatureClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		 String classify = (temp>30)? "Hot": (temp>=15 && temp<=30)? "Moderate" : "Cold";
		 
		 System.out.println(classify);
		 sc.close();
	}

}
