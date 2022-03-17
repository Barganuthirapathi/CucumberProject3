package com.Package;

public class Program2 {

	public static void main(String[] args) {
	/*	// swapping of two numbers by temp variable
		int a=20;
		int b=30;
		int temp;
		System.out.println("Before swap");
		System.out.println(a);
		System.out.println(b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("after swap");
		System.out.println(a);
		System.out.println(b);
	*/	
		//swapping of two numbers without third variable
		int a=20;
		int b=30;
		System.out.println("Before swap");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap");
		System.out.println(a);
		System.out.println(b);
		
	}

}
