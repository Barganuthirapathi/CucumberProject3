package com.Package;

public class ArrayAscending {

	public static void main(String[] args) {
		// Array ascending
		int temp=0;
		int[] num= {3,67,63,95,4};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				
			}
			
		  }
		
		}
		System.out.println("ascending order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("the number:"+num[num.length-6]);
	}

}
