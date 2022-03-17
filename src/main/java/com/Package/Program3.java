package com.Package;

public class Program3 {

	public static void main(String[] args) {
		//reverse the number and palindrome
		int input=171;
		int i=0,j=0,a;
		a=input;
		while(a > 0) {
			i=a%10;
			j=(j*10)+i;  //ouput
			a=a/10;
			
		}
		System.out.println(j);
		
		if (input==j) {
			System.out.println("palindrome:"+j);
		}else {
			System.out.println("not palindrome:"+j);
		}
		

	}

}
