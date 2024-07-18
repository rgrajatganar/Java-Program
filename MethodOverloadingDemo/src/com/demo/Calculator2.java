package com.demo;

class ABC
{
	public void add(int a,int b)
	{
		System.out.println("ABC Class");
	}
	
}
class PQR extends ABC
{
	public void add(int a,int b)
	{
		System.out.println("PQR Class");
	}
}



public class Calculator2 {

	public static void main(String[] args) {
		Calculator2 cal2 = new Calculator2();
				
		ABC a= new ABC();
		a.add(2, 4);
		
		ABC a1= new PQR();//upcasting
		a1.add(3, 3);
		
		PQR p1=(PQR) new ABC(); //Incompatible
		p1.add(10, 20);
	}

}
