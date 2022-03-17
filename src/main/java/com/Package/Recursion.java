package com.Package;

public class Recursion {

	public static void main(String[] args) {
		// recursion
		/*int rem,res=0;
		int n=234,i;
		i=n;
		while(i>0) {
			rem=res+i%10;
			res=rem/10;
		}
		System.out.println(res);

	}
*/
		
		//count small,caps,special characters
		String s="Welcome to 2facebook or Meta";
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				count1++;
			}else {
				if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
					count2++;
				}else {
					if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
						count3++;
					}
				}
			}
				
			}
		System.out.println(" small letterscount1:"+count1);
		System.out.println("caps letters count2:"+count2);
		System.out.println("numbers count3:"+count3);
			
		}
		
		
		
		
}
