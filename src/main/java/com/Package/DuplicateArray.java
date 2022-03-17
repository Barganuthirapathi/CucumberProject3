package com.Package;

public class DuplicateArray {

	public static void main(String[] args) {
		// duplicate array numbers
		
		int[] n= {34,46,86,3,57,89,56,46};
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]==n[j]) {
					System.out.println("duplicate number:"+n[j]);
				}
			}
			
		}
		

	}

}
