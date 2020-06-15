package arrayproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	/*
	 *  Write a program to find the largest 2 numbers and the smallest 2 numbers
	 *   in the given array.
	 */
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();
		
		Arrays.sort(arr);
		System.out.print("Min values "+arr[0]+" "+arr[1]+" "+"Max values "+arr[n-2]+" "+arr[n-1]);
		
	}
	
	
	
}
