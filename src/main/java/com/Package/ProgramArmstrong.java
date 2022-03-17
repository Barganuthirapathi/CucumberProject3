package com.Package;

import java.util.Scanner;

public class ProgramArmstrong {

	public static void main(String[] args) {
	/*	//armstrong number 1 to 1000
	 int i,num,rem,res,med;
	 for (i= 1;  i<=1000; i++) {
		 res=0;
		 num=i;
		 med=num;
		 while(num>0) {
			 rem=num%10;
			 res=res+(rem*rem*rem);
			 num=num/10;
		}
		if(res==med) {
			System.out.println("armstrong"+res);
		}
	}
		*/
		
		//armstrong number using scanner
	/*	int temp ,rem,res=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		
		int  n = sc.nextInt();
		
		
		//int i=153;
		
		temp=n;
		
		while(n>0) {
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if(temp==res) {
			System.out.println("armstrong:");
		}
		else {
			System.out.println("not armstrong:");
		}
	*/	
		//armstrong count
/*		int temp=0,result,rem,res,j,med;
		
		for (int i = 1; i <=1000; i++) {
			res=0;
			j=i;
			med=j;  //backup 
			while(j>0) {
				rem=j%10;
				res=res+(rem*rem*rem);
				j=j/10;
			}		
			if(res==med) {
				System.out.println("armstrong:"+res);
			}
			
		}
	*/	
		//armstrong count
		
       
		
		for (int i = 1; i <=1000; i++) {
			
			int temp=0,result,rem,res=0,j,med;
	   
			//res=0;
			j=i;
			med=j;  //backup 
			while(j>0) {
				rem=j%10;
				res=res+(rem*rem*rem);
				j=j/10;
			}		
			if(res==med) 
				System.out.println("armstrong:"+res);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
