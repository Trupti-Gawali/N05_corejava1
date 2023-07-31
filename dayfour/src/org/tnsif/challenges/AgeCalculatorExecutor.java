/*Ask a user for their birth year encoded as two digit(like "62" )and for the current year,also encoded as two digit(like 23")
 * Write a program to find user's current age in years */

package org.tnsif.challenges;
import java.util.Scanner;
public class AgeCalculatorExecutor {
	
	static void ageCalculator(int by,int cy)
	{
		if(cy>by)
			System.out.println(cy-by);
		else
			System.out.println(100-by+cy);
		}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Birthyear and "+"currentYear ");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);

	}

}
