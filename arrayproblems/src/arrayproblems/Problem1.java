package arrayproblems;

import java.util.Scanner;

public class Problem1 {
	/*
	 *  Write a program to initialize an integer array and print the sum and average of the array.
	 */

	public static void main(String [] args)
	{
		int j;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(j=0;j<n;j++)
		{
			a[j]=scan.nextInt();
		}
		int sum1=0;
		float avg;
		for(j=0;j<a.length;j++)
		{
			sum1=sum1+a[j];
		}
		avg=sum1/a.length;
		System.out.println("Sum is: " + sum1);
		System.out.println("Average is: " + avg);
		scan.close();
	}

}
