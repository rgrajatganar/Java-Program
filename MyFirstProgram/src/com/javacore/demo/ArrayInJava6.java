package com.javacore.demo;

public class ArrayInJava6 {

	public static void main(String[] args) {
		 Double[][] matrix= { 
				{1.2,4.3,4.0},
				{4.1,1.1},
				{2.3}
		};
		
/*		Double[][] matrix1; //declaration of two dimenstional array
		
		double[][] a=new double [3][2]; //Instatiation
		
		int[][] a1=new int [3][2];
		String[][] a2=new String [3][2];*/
		
		int[][] a= {
				{1,2,3},
				{4,5,6,9},
				{7}
		};
		System.out.println("Length of row 1" +a[0].length); //3
		System.out.println("Length of row 2"  +a[1].length); //4
		System.out.println("Length of row 3"  +a[1].length); //1
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);;//6
		System.out.println(a[1][3]);
		System.out.println(a[1][4]);
	
				
		
		//print all the matrix
		
	}

}
