package com.Package;

public class ReverseClass {

	public static void main(String[] args) {
		// reverrse a string
		
	/*	String s="world";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev = rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
*/
		// split a string
		String s="welcome to world";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}
		
		
		
		
		
		
	}

}
