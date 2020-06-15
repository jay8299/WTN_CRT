package arrayproblems;

import java.util.Scanner;

public class Problem3 {

	/*
	 * rite a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
	 */

	public static void main(String [] args)
	{
		int j;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int key = scan.nextInt();
		int a[]=new int[n];
		for(j=1;j<a.length;j++)
		{
			a[j]=scan.nextInt();
		}
		int f=0;
		int c=0;
		for(j=0;j<a.length;j++)
		{
			if(a[j]==key)
			{
				f=1;
				c=j;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(c);
		}
		scan.close();
	}

	
	/*
	 * i/p
	 *  4
		10
		1 2 3 4
		
		o/p
		-1

	 */

}
