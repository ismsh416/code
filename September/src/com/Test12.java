package com;

import java.util.Scanner;
//#Simple Table program
public class Test12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("|" + i + " \sx\s" + j + "\s=\s" + j * i + "|");
			}
			System.out.println("---------------");
		}
//here by input
		/*
		 * Scanner sc = new Scanner(System.in); while(true) {
		 * System.err.print("enter num;"); int m=sc.nextInt(); for (int i = 1; i <= 10;
		 * i++) {
		 * 
		 * System.out.println("|"+m + " \sx\s" + i + "\s=\s" + i * m+"|");
		 * 
		 * } System.out.println("=============="); }
		 */
	}

}
//1