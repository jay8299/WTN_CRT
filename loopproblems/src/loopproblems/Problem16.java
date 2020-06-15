package loopproblems;

import java.util.Scanner;

public class Problem16 {
	/*
	 *  Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
	 */
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();			
		int r;
		int n=0;
		while(a>0){
		r=a%10;
		n=n*10;
		n=n+r;
		a=a/10;
		}
		System.out.println(n);
		}
}
