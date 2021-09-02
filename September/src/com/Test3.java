package com;

public class Test3 {
//Intger Caching 
	private static void test1(Integer i, Integer j) {
		if (i == j) 
			{
				System.out.println("TRUE");
			} 
			else 
				{
				System.out.println("FALSE");
				}
	}
	public static void main(String[] args) {

		test1(100, 100);// TRUE
		test1(128, 128);// FALSE
		test1(127, 127);// TRUE
	}
}


//here Integer range is -128 to 127
//the Integer will cache only in the above range 
//auto boxing