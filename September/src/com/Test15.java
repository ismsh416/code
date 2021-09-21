package com;

//#remove spaces of string with string.replaceall and without
public class Test15 {

	public static void main(String[] args) {
		String Str = "hello world this is java program";
		String[] s = Str.split(" ");
		System.out.println("input :"+Str);
		System.out.print("output :");
		for (String temp : s) {
			System.out.print(temp);
			}
		System.out.println(" ");
//OR
		System.out.println("By Replace All :"+Str.replaceAll("\\s", ""));
		
	}

}
