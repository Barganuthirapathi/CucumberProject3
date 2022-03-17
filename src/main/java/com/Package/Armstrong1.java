package com.Package;

public class Armstrong1 {

	public static void main(String[] args) {
		// Armstrong numbers
		int temp,res=0,rem,input ;
		for (int i = 1; i <1000; i++) {
			res=0;
			temp=i;
			input=temp;
			while(temp>0) {
				rem=temp%10;
				res=res+(rem*rem*rem);
				temp=temp/10;
				
			}
			if (input==res)
				System.out.println("armstrong"+res);
			
		}

	}

}
