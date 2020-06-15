package ifelseproblems;

import java.util.Scanner;

public class Problem4 {
	/*
	Initialize two character variables in a program and 
	display the characters in alphabetical order.

Example1) if the first character is 's' and second character 
			is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', 
			then the output should be a,e
	
	*/
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s1,s2;
		s1=scan.next();
		scan.nextLine();
		s2=scan.next();
		scan.close();
		int c=(int) s1.charAt(0);
		int d=(int)s2.charAt(0);
		if(c<d)
		{
			System.out.println(s1 + "," + s2);
		}
		else
		{
			System.out.println(s2 + "," +s1);
		}
		
	}

	

}
