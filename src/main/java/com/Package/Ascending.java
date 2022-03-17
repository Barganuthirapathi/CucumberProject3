package com.Package;

public class Ascending {

	public static void main(String[] args) {
		// ascending
		int[] n= {23,56,78,97,32,12,11};
		for (int i = 0; i < n.length; i++) {
			
			for (int j = 0; j < n.length; j++) {
				int temp=0;
				if(n[i] < n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
			
				}
			}	
		}	
			for (int i = 0; i < n.length; i++) {
				System.out.println("maxi num:"+n[i]);
			}
		System.out.println("second maximum number:"+n[n.length-2]);
	}

}
