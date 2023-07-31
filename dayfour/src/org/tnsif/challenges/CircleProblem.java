/* There are n people standing in a circle waiting to be executed. 
 * The counting out begins at some points in the circle and proceeds around circle
 *  in fix direction. In each step a certain no of people are skip and next person is executed
 *  the elimination proceeds around the circle(which is becoming smaller and smaller as the executed 
 *  people are remote), until only the last person remains who is given freedom
 *  given the total no of person n and a number k which indicates k-1 person are skip 
 *  and the k person is skilled in person
 *  The task is to choose the person in the initial circle that survives*/
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleProblem {
	
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-k,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
	}

}
