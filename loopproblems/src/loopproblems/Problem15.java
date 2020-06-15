package loopproblems;

import java.util.Scanner;

public class Problem15 {
	/*
	 * Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
	 */
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		scan.close();		
		for(int i=0;i<a;i++){
		for(int j=0;j<=i;j++){
		System.out.print("* ");
		}
		System.out.println();
		}
		}

	

}
