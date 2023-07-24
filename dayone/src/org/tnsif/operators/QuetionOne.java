//To demonstrate elligibility of person for blood donation
package org.tnsif.operators;

import java.util.Scanner;

public class QuetionOne {
	

	public static void Donation() {
		Scanner s=new Scanner(System.in);
		System.out.println("What is your age");
		int age=s.nextInt();
		System.out.println("What is your weight");
		int weight=s.nextInt();
		
		if((age>=18)&&(weight>=50)) {
			System.out.println("You can donate blood");
			
		}
		else {
			System.out.println("You are not elligible for donation");
		}
	}
	public static void main(String args[]) {
		Donation();
	}

}
