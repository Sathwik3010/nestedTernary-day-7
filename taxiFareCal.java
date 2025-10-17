package com.codegnan.operators;

import java.util.Scanner;

public class taxiFareCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kilo Meters you travelled ");
		int km = sc.nextInt();
		
		double charges = (km<=2)?50:
							(km<=10)?(50+(km-2)*15):
								(50 + (8*15)+(km-10)*10) ;
		charges = (km>=20)? charges * 0.95 : charges;
		System.out.println("The ride charges are"+charges);
		sc.close();
	}
}
