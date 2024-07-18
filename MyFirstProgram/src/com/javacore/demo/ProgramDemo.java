package com.javacore.demo;

import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the alphabet");
		String input=sc.next().toLowerCase(); //A-a
		//input = a;
		boolean upperCase=input.charAt(0) >= 65 && input.charAt(0)<=90;
		boolean lowerCase=input.charAt(0) >= 97 && input.charAt(0)<=90;
		boolean vowels=input.equals("a") || input.equals("e") || input.equals("i")||  input ==("o") ||  input ==("u;");
		
		if(input.length()>1)
				
		{
			System.out.println("Error Not a Single Character");
		}
		else if(!(upperCase || lowerCase))
		{
			System.out.println("Error Not a Letter Enter Uppercase or Lowercase");
			
		}
		else if(vowels)
		{
			System.out.println("Input Letter is vowel");
		}
		else
		{
			System.out.println("Input letter is Consonants");
		}
				
				
	}

}
