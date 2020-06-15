package arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class Problem9 {
	/*
	 * Print a version of the given array where all the 10's have been removed.
	 *  The remaining elements should shift left towards the start of the array as needed, 
	 *  and the empty spaces at the end of the array should be 0. 
	 *  So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and 
	 *  display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
	 */
	public static void main(String args[])
	{
	
		List<Integer> arr = new ArrayList<Integer>();
		
		for(String i: args)
		{
			if (Integer.parseInt(i)!=10)
			{
				arr.add(Integer.parseInt(i));
			}
		}
		for(int i=arr.size();i<args.length;i++)
		{
			arr.add(0);
		}
		for(Integer i: arr)
		{
			System.out.print(i+" ");
		}

	
	}
	

}
