package com.Package;

public class B  {
	
	public static void main(String[] args) {
		
		A a=A.createObject();
		System.out.println(a);
		a.test();
		
		A a1=A.createObject();
		System.out.println(a1);
		a1.test();
	}
}
