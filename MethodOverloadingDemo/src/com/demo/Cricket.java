package com.demo;


class Game
{
	public void Type()
	{
		System.out.println("Indoor or Outdoor");
	}
}
class Carrom extends Game
{
	public void Type()
	{
		System.out.println("Indoor");
	}
}
public class Cricket extends Game
{
	public void Type()
	{
		System.out.println("Cricket is a Outdoor");
	}

	public static void main(String[] args) {
		
		Game gm=new Game();
		gm.Type();//call game class method
		
		Cricket ck=new Cricket();
		ck.Type(); //call Cricket class method
		
		Game gm1=new Game();
		gm1.Type();
		
		Game gm2=new Cricket();
		gm2.Type();
	}

}
