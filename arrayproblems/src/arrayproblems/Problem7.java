package arrayproblems;

public class Problem7 {

	/*
	 * Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
	 */
	
	
	static int removeDuplicates(int arr[], int n) 
    { 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
	{
		if (arr[i] != arr[i+1]) 
		{
	 
                	temp[j++] = arr[i]; 
		}
         }
        temp[j++] = arr[n-1];    
          
        for (int i=0; i<j; i++) 
	{
        	arr[i] = temp[i]; 
	}
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = new int[args.length];
        int j;
	for(j=0;j<args.length;j++)
	{
		arr[j]=Integer.parseInt(args[j]);
	}
        int n = arr.length; 
          
        n = removeDuplicates(arr, n); 
   
        for (int i=0; i<n; i++) 
	{
        	System.out.print(arr[i]+" "); 
	}
    } 

}
