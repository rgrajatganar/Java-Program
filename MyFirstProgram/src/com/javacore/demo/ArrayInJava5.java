package com.javacore.demo;

public class ArrayInJava5 {

	public static void main(String[] args) {
		int[]a = {12,21,0,5,7};
		
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		a[2] = 56;
		System.out.println(b[2]);
		
		b[4]=100;
		System.out.println(b[4]);
		
		
	}

}
