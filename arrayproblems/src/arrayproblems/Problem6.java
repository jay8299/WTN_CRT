package arrayproblems;

import java.util.Arrays;

public class Problem6 {
	/*
	 *  Write a program to initialize an array and print them in a sorted order.
	 */
	
	
	public static void main(String [] args)
	{
		int j;
		int a[]=new int[args.length];
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
		Arrays.sort(a);
		for(j=0;j<a.length;j++)
		{
			System.out.print(a[j] + " ");
		}
	}


}
