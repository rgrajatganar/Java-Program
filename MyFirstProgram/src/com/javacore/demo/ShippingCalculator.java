package com.javacore.demo;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose a shipping method:");
		        System.out.println("1. Standard Shipping");
		        System.out.println("2. Express Shipping");
		        System.out.println("3. Overnight Shipping");

		        int shippingMethod = scanner.nextInt();

		        double baseCost = 10.0; // Base shipping cost

		        switch (shippingMethod) {
		            case 1:
		                System.out.println("You chose Standard Shipping.");
		                break;
		            case 2:
		                System.out.println("You chose Express Shipping.");
		                baseCost = 20.0; // Adjust cost for express shipping
		                break;
		            case 3:
		                System.out.println("You chose Overnight Shipping.");
		                baseCost = 30.0; // Adjust cost for overnight shipping
		                break;
		            default:
		                System.out.println("Invalid shipping method. Standard Shipping selected by default.");
		        }

		        double totalCost = baseCost; // Calculate total cost

		        System.out.println("Total shipping cost: $" + totalCost);

		        scanner.close();
		    }
		

	}


