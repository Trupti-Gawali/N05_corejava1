/*Pratik is so much intrested in gardening and hence he plants more trees in his garden. 
 * He plants trees in rectangular fashion with the order of rows and columns and numbers the tree in row wise
 * order. He planted the mango tree only in the first row, first column and last column. So, given the tree number
 * and rows and columns.
 * Your task is to find out whether the given tree is mango tree or not.
 * n=5 t=11 */


package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void ismangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		ismangoTree(n,t);
		
		

	}

}
