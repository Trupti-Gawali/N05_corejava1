//program to demonstrate on count of digits in given number
package org.tnsif.looping;
import java.util.Scanner;
public class DigitCountExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,count=0;
		System.out.print("Enter number: ");
		n=s.nextInt();
			
	
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.print("Number of digits : "+count);

	}

}
