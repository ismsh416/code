package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//sorting and removing duplicates in array
//for extra i have opted arraycopy to merge array instead two for loops
public class Test10 {

	public static void main(String[] args) {
		int[] ar1= {9,9,1,2,7};
		int[] ar2= {8,7,4,3,6};
		int[] ar3=new int[ar1.length+ar2.length];
		//Merging both arrays to single array
		System.arraycopy(ar1,0,ar3,0,ar1.length);
		System.arraycopy(ar2,0,ar3,ar1.length,ar2.length);
		System.out.println(Arrays.toString(ar3));
	
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<=ar3.length-1;i++)
		{
			set.add(ar3[i]);
			
		}
		
		System.out.println(set);
	}

}
