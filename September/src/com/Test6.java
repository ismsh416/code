package com;

import java.util.Arrays;
import java.util.Scanner;

//i/p=abcde o/p=131a2bc5e8
//1.count the string is 5 fib(5)=1 1 2 3 5=add all=11
//11 a 1 b 1 c 2 d 3 e 5
public class Test6 {
	public static void fibno(String S) {
		char[] c = S.toCharArray();
		int CL = c.length;

		// fibonacci
		int f1 = 1, f2 = 1, f3, sum = 1;
		int[] FIB = new int[CL];
		FIB[0] = f1;
		FIB[1] = f2;
		for (int i = 2; i < CL; i++) {
			f3 = f2 + f1;
			FIB[i] = f3;
			f1 = f2;
			f2 = f3;
			sum += FIB[i];

		}
		System.out.print(sum);
		// System.out.print(Arrays.toString(FIB));
		// System.out.print(c);
		for (int j = 0; j <= CL - 1; j++) {
			System.out.print(" "+c[j] + " " + FIB[j]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE STRING");
		String Str = sc.next();
		// Fibnacco(String s){

		fibno(Str);

	}

}
