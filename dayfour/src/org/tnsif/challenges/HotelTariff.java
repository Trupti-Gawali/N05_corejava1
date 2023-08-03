/*Write a program to calculate the Hotel tariff.The room rent is 20% high during peak seasons(Apr to jun is peak season 
 * and Nov to Dec is peak season) Note:Use the switch cases
 * Sample input: month=3 rent=  days=*/

package org.tnsif.challenges;
import java.util.Scanner;


public class HotelTariff {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter month");
		int month=s.nextInt();
		System.out.println("Enter rent");
		float rent=s.nextFloat();
		System.out.println("Enter days");
		int days=s.nextInt();
		
		switch(month)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println(rent+(rent*0.2))*days
		
			
		tariff=rent*day);
		break;
		default:
			tariff=rent*day;
			break;
		}
		System.out.println(tariff);
		

	}

}
