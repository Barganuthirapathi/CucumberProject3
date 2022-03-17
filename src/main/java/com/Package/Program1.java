package com.Package;

import java.awt.desktop.QuitEvent;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		//find out odd or even
		//way1
		
	/*	int i=4;
		if(i%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd numbers");
		} */
		
		//way2
		
	/*	Scanner s=new Scanner(System.in);
		System.out.println("enter the input value:");
		int i = s.nextInt();
		if(i%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd numbers");
		}  */
		
		//way3
		
	/* for(int i=1;i<+100;i++) {
			if(i%2==0) {
				System.out.println("even number:"+i);
			}else {
				System.out.println("odd numbers:"+i);
			}  
		}  */
	 //way4
		
	/* int count=0;
	 int odd=0;
	 for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("even number:"+i);
				count+=i;
				
			}else {
				System.out.println("odd numbers:"+i);
				odd++;
			}  
		}
	 System.out.println("count even number:"+count);
	 System.out.println("count odd number:"+odd);
		
	*/
		
/*	//factorial
		int sum=1;
		
	for (int i=1;i<=5;i++) {
		
	sum=sum*i;
	System.out.println(sum);
	
	}	*/
	
	//fibancci series
	int n1=0,n2=1,n3;
	System.out.println(n1);
	System.out.println(n2);
	for (int i=1;i<15;i++) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	
	
	
	
	
	
}
	
}

