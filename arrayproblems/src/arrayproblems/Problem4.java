package arrayproblems;

public class Problem4 {
	/*
	 *  Initialize an integer array with ascii values and print the corresponding character values in a single row.
	 */

	public static void main(String [] args)
	{
		int j;
		int a[]=new int[args.length];
		for(j=0;j<args.length;j++)
		{
			a[j]=Integer.parseInt(args[j]);
		}
		for(j=0;j<a.length;j++)
		{
			char c=(char)a[j];//Explicit Conv
			System.out.print(c +" ");
		}
	}

}
