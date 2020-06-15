package loopproblems;

import java.util.Scanner;

public class Problem12 {
/*
 *  Write a program to check if a given number is prime or not.
 */

	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();
		int f=0;
		for(int i=2;i<=a/2;i++)
		{
		
			if(a%i==0)
		{
			System.out.println("not prime");
			f=1;
			break;
		}
		
		}
		if(f==0){
			System.out.println("prime");
			}
			
	}

	


}
