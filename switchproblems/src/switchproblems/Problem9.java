package switchproblems;

import java.util.Scanner;

public class Problem9 {

	/*
	 * Write a program to receive a number and print the corresponding month name.

Example1)

C:\>java Sample 12

O/P Expected : December

Example2)

C:\>java Sample 

O/P Expected : Please enter the month in numbers

Example3)

C:\>java Sample 15

O/P Expected : Invalid month
	 */
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		scan.close();
		if(m>=1 && m<=12)
		{
			if(m==1)
			{
				System.out.println("January");
			}
			else if(m==2)
			{
				System.out.println("February");
			}
			else if(m==3)
			{
				System.out.println("March");
			}
			else if(m==4)
			{
				System.out.println("April");
			}
			else if(m==5)
			{
				System.out.println("May");
			}
			else if(m==6)
			{
				System.out.println("June");
			}
			else if(m==7)
			{
				System.out.println("July");
			}
			else if(m==8)
			{
				System.out.println("August");
			}
			else if(m==9)
			{
				System.out.println("September");
			}
			else if(m==10)
			{
				System.out.println("October");
			}
			else if(m==11)
			{
				System.out.println("November");
			}
			else
			{
				System.out.println("December");
			}
		}
		else
		{
			System.out.println("Invalid month");
		}
	}

	
}
