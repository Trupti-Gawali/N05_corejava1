/*A microwave oven manufacturer recommends that when heating two items,and 50% to the heating time and when heating three items double the 
 * heating time. Heating more than three items is not recommended. 
 * Write a program to find out the recommended heating time.
 * Sample input : item=2, heating time=5.0*
 * output 7.50 NOTE: Use switch cases*/


package org.tnsif.challenges;
import java.util.Scanner;
public class MicrowaveOven {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int item=s.nextInt();
		float ht=s.nextFloat();
		switch(item)
		{
		case 1:
			System.out.println(ht);
			break;
		case 2:
			System.out.println(ht/2)+ht));
			break;
		case 3:
			
		    System.out.println(2*ht);
			break;
			default:
				System.out.println("Heating more than three items are not recommended";)
				
			
		}
		

}
}
