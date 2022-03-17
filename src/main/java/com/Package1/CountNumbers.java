package com.Package1;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		//  to check panlindrome or not
		int i,rem=0,res=0,in;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
	    i = sc.nextInt();
		in=i;
		while(in > 0) {
			rem=in % 10;
			res=(res*10)+ rem;
			rem=rem/10;
			
			
		}
		if(i==res) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not  palindrome");
		}
		
		
			
		
	}

}
