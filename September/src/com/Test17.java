package com;

//get the second highest number in array
public class Test17 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 8, 7, 4, 3, 6, 9 };
		int hnum1 = 0, hnum2 = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] >= hnum1) {
				hnum1 = array[i];
			}
		}
		System.out.println("1st Highest : " + hnum1);

		for (int j = 0; j <= array.length - 1; j++) {
			if (array[j] < hnum1) {
				if (array[j] >= hnum2) {
					hnum2 = array[j];
				}
			}
		}
		System.out.println("2nd Highest : " + hnum2);
	}
}