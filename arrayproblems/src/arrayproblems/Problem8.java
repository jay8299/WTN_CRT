package arrayproblems;

public class Problem8 {
	/*
	 * Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
	 */

	
	public static void main(String [] args)
	{
		int a[]=new int[args.length];
		int j;
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
		int c=0;
		int d=0;
		for(j=0;j<a.length;j++)
		{
			if(a[j]==6)
			{
				c=j;
			}
			else if(a[j]==7)
			{
				d=j;
			}
		}
		int sum1=0;
		for(j=0;j<a.length;j++)
		{
			if(c<d)
			{
				if(j>=c && j<=d)
				{
					continue;
				}
				else
				{
					sum1=sum1+a[j];
				}
			}
			else
			{
				sum1=sum1+a[j];
			}
		}
		System.out.println(sum1);
	}

}
