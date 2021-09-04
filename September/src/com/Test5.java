package com;

public class Test5 {

	//To Print ASCI value of a given string
		public static void main(String[] args) {
			String S = "BBASSSRPPPOCCBdcbaa";
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				int asc = (int) c;
				System.out.println(c + "=" + asc);

			}
//printing ASCI from A-z
			char k1 = 'A';
			char k2 = 'z';
			System.out.println("Printing from "+k1+" to "+k2);
		
			for (int i = (int) k1; i <= (int) k2; i++) {
				System.out.println((char) i + "=" + i);
			}

		}
	
}
