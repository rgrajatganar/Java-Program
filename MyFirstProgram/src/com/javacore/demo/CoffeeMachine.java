package com.javacore.demo; //Switch Case

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose your coffee:");
		        System.out.println("1. Espresso");
		        System.out.println("2. Latte");
		        System.out.println("3. Cappuccino");
		        System.out.println("4. Americano");

		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("You chose Espresso. Price: $2.50");
		                break;
		            case 2:
		                System.out.println("You chose Latte. Price: $3.00");
		                break;
		            case 3:
		                System.out.println("You chose Cappuccino. Price: $3.50");
		                break;
		            case 4:
		                System.out.println("You chose Americano. Price: $2.00");
		                break;
		            default:
		                System.out.println("Invalid choice. Please choose a valid option.");
		        }

		        scanner.close();
		    }
		
	}


