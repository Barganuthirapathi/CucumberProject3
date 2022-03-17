package com.Package;

public class A {
	public static  A a;
	
	public static  A createObject() {
		if(a== null) {
			a=new A();
		}
	return a;
	}
	
	private A() {
		
	}
	
	public void test() {
		System.out.println("test");
		
	}
}
