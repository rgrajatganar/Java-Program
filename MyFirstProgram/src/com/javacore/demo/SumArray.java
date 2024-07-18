package com.javacore.demo;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int[] numbers=new int[sc.nextInt()];
		int sum=0;
		
		System.out.println("Enter"+numbers.length+"Elemets of array :");
		for(int i=0;i<numbers.length;i++)
		{
			
			numbers[i] =sc.nextInt();
			sum=numbers[i]+sum;
		}
		System.out.println("Sum of all array elements is :");
		
	}

}
