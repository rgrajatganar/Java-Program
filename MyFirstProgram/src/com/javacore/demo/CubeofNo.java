package com.javacore.demo;

import java.util.Scanner;

public class CubeofNo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number =");
		int i=sc.nextInt();
		
		int cube=i*i*i;
		System.out.println("Cube of " + i + " is ="+cube);

	}

}
