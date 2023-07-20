package org.tnsif.introduction;

import java.util.Scanner;
//program to demonstrate on User Input value
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=s.nextInt();
		System.out.println("The value of num is: "+num);
		
		System.out.println("Enter the value of floatnum");
		float num1=s.nextFloat();
		System.out.println("The value of floatnum is: "+num1);
		
		System.out.println("Enter value of char");
		char c=s.next().charAt(0);
		System.out.println("Character is: "+c);
		
		System.out.println("Enter value of string");
		String str1=s.nextLine();
		s.next();
		System.out.println("String is: "+str1);
	}

}
