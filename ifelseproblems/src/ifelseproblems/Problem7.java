package ifelseproblems;

import java.util.Scanner;

public class Problem7 {

	/*
	 * Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
	 */
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s1=scan.next();
		scan.close();
		int v=(int) s1.charAt(0);
		int c;
		if(v>=97 && v<=122)
		{
			c=v-32;
			char s2=(char)c;
			System.out.println(s1 + "-->" + s2);
		}
		else
		{
			c=v+32;
			char s3=(char)c;
			System.out.println(s1 + "-->" + s3);
		}	
	}

	/*
	 *  i/p: a
		o/p: a-->A

	 */
	
	
}
