package com.Package;

public class ArrayDescending {

	public static void main(String[] args) {
		// descending
		
		int[] num= {23,45,8,9,27};
		int temp=0;
		for (int i = 0; i < args.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]<num[j]) {
					temp  =num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
				
			}
		}
		System.out.println("descending order:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}

	}

}
