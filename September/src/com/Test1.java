package com;

public class Test1 {
	private static void StrtoNum(String s) {
		int len = s.length();
		int num = 0;
		for (int i = 0; i < len; i++) {

			num = num * 10 + ((int) s.charAt(i) - 48);
			// 0*10+1=1
			// 1*10+2=12
			// 12*10+3=123

		}
		System.out.println(num + 10);
	}

	public static void main(String args[]) {
		String a = "123";
		int z=Integer.parseInt(a); //we should not use inbuilt functions
		StrtoNum(a);
		System.out.println(z);

		// System.out.println(a.charAt(0));
	}

}