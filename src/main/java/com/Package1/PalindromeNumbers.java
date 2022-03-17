package com.Package1;

public class PalindromeNumbers {

	public static void main(String[] args) {
		// palindrome or not 1 to 100
		
		for (int n = 1; n <=100; n++) {
			int i,rem,res=0;
			i=n;
			while(i>0) {
				rem=i%10;
				res=(res*10)+rem;
				rem=rem/10;
			}
			if(i==res) {
				System.out.println(res);
			}
			
			
		}

	}

}
