package ifelseproblems;

import java.util.Scanner;

public class problem1 {
	
/*	 A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

	B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

	     lastDigit(7, 17) → true
	     lastDigit(6, 17) → false
	     lastDigit(3, 113) → true

*/	

public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	
	int x = scan.nextInt();
	int y = scan.nextInt();
	int z = scan.nextInt();
	scan.close();

	//A
	if(x>0)
	{
		System.out.println("Positive Number");
	}
	else if(x==0)
	{
		System.out.println("Number is Zero");
	}
	else
	{
		System.out.println("Negative Number");
	}

	//B
	
	if(y%10 == z%10)
	{
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	
}
	
	/*
	 * 1
27 37
Positive Number
True

	 */
	
	
}
