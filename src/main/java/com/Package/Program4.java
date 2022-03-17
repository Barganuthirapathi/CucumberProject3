package com.Package;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	/*	// armstrong
		//way1
		int in=153;
		int a,i=0,j=0;
		a=in;
		
		while( a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		System.out.println(j);
		if(in==j) {
			System.out.println("armstrong number:"+j);
		}else {
			System.out.println("not armstrong number:"+j);
		}
		}  */
		
		//way2
	
	/*	int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }	 
	*/	
		//way3
		int a,j,out=0,count=0;
		
		for(int i=10;i<100;i++) {
			a=i;
			while(a!=0) {
				j=a%10;
				out=out+(j*j*j);
				a=a/10;
			}
			if(i==out) {
				System.out.println("amrstrong:"+out);
				count++;
			}else {
				System.out.println("not amrstrong:"+out);
			}
	//  out=0;
	}
		System.out.println(count);
		
	/*	//way4  scanner class
		int temp,rem=0,res=0,num;
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the value:");
	    num = scan.nextInt();
        temp=num;
		while(temp>0) {
			rem=temp%10;
			res=res+(rem*rem*rem);
			temp=temp/10;
		}
			if(num==res) {
				System.out.println("amrstrong:"+res);
			}else {
				System.out.println("not amrstrong:"+res);
			}
		*/	
	 }			
	
}
