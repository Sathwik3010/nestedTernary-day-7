package com.codegnan.operators;

import java.util.Scanner;
public class DayGreeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time");
		int time = sc.nextInt();
		
		if(time<0 || time>23) {
            System.out.println("Invalid hour! Please enter a value between 0 and 23.");
		} else {
		String greeting = (time>=5 && time<=12)? "Good Morning":
			(time>=12 && time<=17)? "Good Afternoon" :
				(time>=17 && time<=22)? "Good Evening" : 
					"Good Night" ;
        System.out.println("\nGreeting: " + greeting);
		}
		sc.close();
	}
}
