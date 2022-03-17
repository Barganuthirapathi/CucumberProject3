package com.Package;

import java.util.HashMap;
import java.util.Map;

public class CharacterWord {

	public static void main(String[] args) {
		// convert string to char
		String s="welcome to new world";
		Map<Character,Integer> m=new HashMap();
		char[] s1 = s.toCharArray();
		for (char x : s1) {
			if(m.containsKey(x)) {
				Integer i = m.get(x);
				m.put(x, i+1);
				
			}else {
				m.put(x,1);
			}
		}
		System.out.println(m);

	}

}
