package com.javacore.demo;

//Write a Java program that takes a number from the user and generates an integer
//between 1 and 7. It displays the weekday name.
import java.util.Scanner;

public class WeekName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no. between 1 to 7 = ");
		int a=sc.nextInt();
		

		switch(a)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Thuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
