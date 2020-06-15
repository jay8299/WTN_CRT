package loopproblems;

public class Problem19 {

	/*
	 *  Write a program to print first 5 values which are divisible by 2, 3, and 5.

	 */
	
	
	public static void main(String args[]){
		int i,x=0;
		for(i=1;i<200;i++){
		    if(x==5)
		    break;
		    if(i%2==0 && i%3==0 && i%5==0){
		    System.out.println(i+" ");
		      x++;
		    }
		  }
		 }

}
