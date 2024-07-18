package com.javacore.demo;

public class ArrayInJava7 {

	public static void main(String[] args) {
		int[][] a= {
				{1,-2,3},
				{-4,-5,6,9},
				{7}
		};
		
		/*for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
			//use for each loop for the above matrix to display the matrix
			//how initialize 
		}
		*/
		 // Using for-each loop the matrix
        for (int[] row : a) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        

        };
};
}


