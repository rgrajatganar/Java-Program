package com.javacore.demo;

import java.util.Scanner;

public class SumAndAverageNo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
				System.out.println("Enter 5 number from keyborad =");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				int e=sc.nextInt();
				
				int sum=a+b+c+d+e;
				System.out.println("Sum of 5 number is = "+ sum);
				
				int avg=(a+b+c+d+e)/5;
				System.out.println("Average of 5 number is = "+ avg);

				

			}

		
	}


