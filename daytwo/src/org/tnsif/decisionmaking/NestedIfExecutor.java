/*program to demonstrate on bunjee jumping using nested if*/
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>40)
			{
				System.out.println("Elligible for bunjee jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Elligible");
			}
		}
		else
		{
			System.out.println("Not Elligible");
		}

	}

}
