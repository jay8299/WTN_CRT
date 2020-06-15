package ifelseproblems;

import java.util.Scanner;

public class Problem2 {
	
	// Write a program to check if a given integer number is odd or even.
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
