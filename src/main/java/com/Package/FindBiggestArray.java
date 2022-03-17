package com.Package;

public class FindBiggestArray {

	public static void main(String[] args) {
		
		int[] n= {23,46,67,89,2,3};
		
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i+1; j <n.length; j++) {
				int temp=0;
				
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(" number:"+n[i]);
		}
		System.out.println("second maximum value number:"+n[n.length-2]);
	}
}
