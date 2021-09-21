package com;

import java.util.HashMap;
//#duplicate character finder in string
public class Test16 {

	public static void main(String[] args) {
		String str = "HELLOWORLD";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (hm.get(ch[i]) != null) {
				hm.put(ch[i], hm.get(ch[i]) + 1);
			} else
				hm.put(ch[i], 1);
		}
		System.out.println(hm);

	}

}
