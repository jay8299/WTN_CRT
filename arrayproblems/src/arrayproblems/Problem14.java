package arrayproblems;

public class Problem14 {

	/*
	 * Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
	 */
	public static void main(String [] args)
	{
		int a[]=new int[args.length];
		int j;
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
		int max=a[0];
		if((a.length<9) || (a.length>9))
		{
			System.out.println("Please enter 9 integer elements");
		}
		else
		{
			for(j=0;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			System.out.println("maximum element is: " + max);
		}
	}

}
