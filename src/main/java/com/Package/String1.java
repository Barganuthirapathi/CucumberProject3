package com.Package;

public class String1 {

	public static void main(String[] args) {
		/*
		 * // reverse the string String originalstr="liril";
		 * 
		 * 
		 * 
		 * for (int i =originalstr.length()-1 ; i>=0; i--) { char values =
		 * originalstr.charAt(i); System.out.print(values); }
		 */
		
		
		//reverse the string
		
		String str="welcome to facebook";
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
			
		}
	  System.out.println("reversed string is :"+rev);
	}

}
