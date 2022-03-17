package com.Package;

public class StringPalindrome {

	public static void main(String[] args) {
		// palindrome or not
		String input="malayalam";
		int length = input.length();
		String rev="";
		for (int i = length-1; i>=0; i--) {
			rev=rev+input.charAt(i);
			
		}
		System.out.println("reversed string:"+rev);
		if(input.equals(rev)) {
			System.out.println("palindrome:"+rev);
		}else {
			System.out.println("not a palindrome:"+rev);
		}

	}

}
