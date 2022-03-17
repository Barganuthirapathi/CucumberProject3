package com.Package;

import java.util.HashMap;
import java.util.Map;

public class StringWords {

	public static void main(String[] args) {
		//String words seperation
		String s="welcome to java to class";
		Map<String, Integer> m=new HashMap();
		String[] s1 = s.split(" ");
		for (String x : s1) {
			if(m.containsKey(x)) {
				Integer i = m.get(x);
				m.put(x, i+1);
				
			}else {
				m.put(x, 1);
			}
			
		}
		System.out.println(m);
	}

}
