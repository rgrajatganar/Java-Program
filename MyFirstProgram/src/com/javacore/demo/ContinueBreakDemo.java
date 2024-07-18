package com.javacore.demo;

public class ContinueBreakDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			if(i == 5)
				continue; //brake
			System.out.println("i =" +i);
		}

	}

}
