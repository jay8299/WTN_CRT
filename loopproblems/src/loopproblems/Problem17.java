package loopproblems;

import java.util.Scanner;

public class Problem17 {
	/*
	 * Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
	 */

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();		
		int k=0,r,t=a;
		while(a!=0){
		r=a%10;
		k=k*10+r;
		a=a/10;
		}
		if (t==k){
		System.out.println(t+" is a palindrome");
		}
		else{
		System.out.println(t+" is not a palindrome");
		}
		}

	
	
	
}
