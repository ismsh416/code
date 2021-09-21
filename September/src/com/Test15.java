package com;

//#remove spaces of string
public class Test15 {

	public static void main(String[] args) {
		String Str = "hello world this is java program";
		String[] s = Str.split(" ");
		System.out.println("input :"+Str);
		System.out.print("output :");
		for (String temp : s) {
			System.out.print(temp);
		}

	}

}
