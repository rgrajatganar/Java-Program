package com.javacore.demo;

import java.util.Scanner;

public class GreterNo {

	public static void main(String[] args) {
		//Write a Java program that takes three numbers from the user and prints the 
		// greatest number.
	

				Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter 1st  number= ");
				int a=sc.nextInt();
				System.out.println("Enter 2nd  number= ");
				int b=sc.nextInt();
				System.out.println("Enter 3rd  number= ");
				int c=sc.nextInt();
				
				if(a>b && a>c)
					{
						System.out.println("a is the gretest number= " +a);
					}
				
				else if(b>c && b>a) 
					{
						System.out.println("b is the gretest number= " +b);
					}
					
					else
					{
						System.out.println("c is the grtest number = "+c);
					}
				

			}

		

	}


