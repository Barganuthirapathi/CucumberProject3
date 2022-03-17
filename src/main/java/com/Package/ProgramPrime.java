package com.Package;

public class ProgramPrime {

	public static void main(String[] args) {
		// prime numbers
		
		for (int i = 1; i <=10; i++) {
			 int count=0;
			for (int j = 2; j <=i/2; j++) {
				if(i%j==0) {
					count++;
				}
			}	
			if(count==0) {
				System.out.println("prime number:"+i);
			}
			
			
		}
		
		
	}
}	
	