package com.javacore.demo;

import java.util.Arrays;

public class ArrayInJava3 {

	public static void main(String[] args) {
		int[] a= {12, 21, 0, 5,7};
		
		int[] b =Arrays.copyOf(a, a.length);
		
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		a[2]=56;
		System.out.println(b[2]); // value of 3rd element in array"a"
		
		a[4]=100;
		System.out.println(b[4]);// value of 5th element in array"a"

	}

}
