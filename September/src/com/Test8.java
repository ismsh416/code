package com;
//find  duplicate elements in array and print how many times its occurred
import java.util.HashMap;

public class Test8 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] ar = { 9, 9, 1, 2, 7, 8, 7, 4, 3,6 };
		for (int i = 0; i <= ar.length - 1; i++) {
			if (hm.get(ar[i]) != null) 
			{
				hm.put(ar[i], hm.get(ar[i]) + 1);
			} else
				hm.put(ar[i], 1);

		}
		System.out.println(hm);
	}

}
