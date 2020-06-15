package arrayproblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Problem10 {

	/*
	 * Print an array that contains the exact same numbers as the given array,
	 *  but rearranged so that all the even numbers come before all the odd numbers. 
	 *  Other than that, the numbers can be in any order. 
	 *  You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
	 */
	public static void main(String args[])
	{
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();
		for(int i : arr)
		{
			if(i%2==0)
			{
				even.add(i);
			}
			else
			{
				odd.add(i);
			}
		}
		for(int i : even)
		{
			System.out.print(i+" ");
		}
		for(int i : odd)
		{
			System.out.print(i+" ");
		}

		
	}
	
}
