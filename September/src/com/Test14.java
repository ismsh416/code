package com;

public class Test14 {
//#Pyramid with numbers
	public static void main(String[] args) {
		int p = 4;
		int z=1;

		for (int i = 1; i <= p; i++) {
			for (int j = 1; j <= p - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(z+++" ");
			}
			System.out.println(" ");
		}
	}

}

/*
   1  
  2 3  
 4 5 6  
7 8 9 10  

*/
