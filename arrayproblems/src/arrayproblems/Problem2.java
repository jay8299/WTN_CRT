package arrayproblems;

import java.util.Scanner;

public class Problem2 {
	/*
	 *  Write a program to initialize an integer array and find the maximum and minimum value of the array.
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
		int min=a[0];
		for(j=0;j<a.length;j++)
		{
			if(a[j]<a[0])
			{
				min=a[j];
			}
			else
			{
				continue;
			}
		}
		System.out.println("Minimum element is: " + min);
		int max=a[0];
		for(j=0;j<a.length;j++)
		{
			if(a[j]>a[0])
			{
				max=a[j];
			}
			else
			{
				continue;
			}
		}
		System.out.println("Maximum element is: " + max);
		scan.close();

	}


}
