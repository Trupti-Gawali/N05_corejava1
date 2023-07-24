package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int wight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("You are elligible");
		}
		
		else
		{
			System.out.println("You are not elligible");
		}
	}

}
