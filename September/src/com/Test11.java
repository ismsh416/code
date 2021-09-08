package com;
//matrix[1 2]-->transpose[1 3]
//      [3 4]            [2 4]
import java.util.Arrays;
import java.util.Scanner;
public class Test11{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows:");
		int rows=sc.nextInt();
		System.out.println("enter the cols:");
		int cols=sc.nextInt();
		int matrix[][] =new int[rows][cols];
		int transpose[][] =new int[cols][rows];
		System.out.println("Create a matrix data");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Print the matrix");
		for(int[] m : matrix)
		{
			System.out.println(Arrays.toString(m));
		}
		System.out.println("Transposing the Matrix data....");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				
				transpose[j][i]=matrix[i][j];
				
			}
		}
		System.out.println("The Transposed matrix is:");
		for(int[] t : transpose)
		{
			System.out.println(Arrays.toString(t));
		}
	}
}
/*
enter the rows:
2
enter the cols:
2
Create a matrix data
1
2
3
4
Print the matrix
[1, 2]
[3, 4]
Transposing the Matrix data....
The Transposed matrix is:
[1, 3]
[2, 4]
*/