package loopproblems;

import java.util.Scanner;

public class Problem14 {
	/*
	 * Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
	 */
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();
		if(a<=9)
		System.out.println(a);
		else{
		int r;
		int s=0;
		while(a>0){
		r=a%10;
		s=s+r;
		a=a/10;
		}
		System.out.println(s);
		}
		}
}
