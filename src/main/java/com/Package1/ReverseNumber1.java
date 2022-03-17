package com.Package1;

public class ReverseNumber1 {

	public static void main(String[] args) {
		// reverse the string  ouptu=emocwel
		
		String s="welcome";
		String rev=" ";
		for (int i =s.length()-1 ; i>=3; i--) {
			rev=rev+s.charAt(i);
		}	
			for (int i = 0; i <=2; i++) {
				rev=rev+s.charAt(i);
				
			}	
			
			
			
		System.out.println(rev);

	}

}
