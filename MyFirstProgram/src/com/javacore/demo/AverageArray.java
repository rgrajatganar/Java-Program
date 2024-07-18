package com.javacore.demo;

public class AverageArray {

	public static void main(String[] args) {
		   // Sample array
		        int[] array = {5, 10, 15, 20, 25};

		        // Calculate the average
		        double average = calculateAverage(array);

		        // Display the average
		        System.out.println("Average of the array elements: " + average);
		    }

		    public static double calculateAverage(int[] array) {
		        int sum = 0;

		        // Calculate the sum of array elements
		        for (int num : array) {
		            sum += num;
		        }

		        // Calculate the average
		        double average = (double) sum / array.length;
		        return average;
		    }
		


	}

