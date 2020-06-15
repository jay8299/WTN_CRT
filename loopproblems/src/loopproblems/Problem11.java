package loopproblems;

public class Problem11 {

	/*
	 *  Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.
	 */
	
	public static void main(String [] args)
	{
		int j;
		for(j=23;j<=57;j++)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}
		}
	}

}
