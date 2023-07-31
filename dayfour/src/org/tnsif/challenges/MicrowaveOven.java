/*A microwave oven manufacturer recommends that when heating two items,and 50% to the heating time and when heating three items double the 
 * heating time. Heating more than three items is not recommended. 
 * Write a program to find out the recommended heating time.
 * Sample input : item=2, heating time=5.0*
 * output 7.50 NOTE: Use switch cases*/


package org.tnsif.challenges;
import java.util.Scanner;
public class MicrowaveOven {

	public static void main(String[] args) {
		int numItems;
		int heatingTime;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
	    numItems=s.nextInt();
	    
	    System.out.println("Enter the heating time: ");
	    heatingTime=s.nextInt();
	    
	    if(numItems == 1)
	    {
	    	 System.out.println("Heating time: "+heatingTime);
	    }
	    else if(numItems == 2) {
	  
	}

}
}
