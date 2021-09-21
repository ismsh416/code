package com;

public class Test13 {
	//#reversing string below using with method and without
	public static void StrRev(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuilder sb1 = new StringBuilder(str);
		System.err.println("without method ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.err.println("\nwith method ");
		System.out.println("buffer : " + sb.reverse());
		System.out.println("builder: " + sb1.reverse());
	}

	public static void main(String[] args) {
		StrRev("ismail");
	}

}
