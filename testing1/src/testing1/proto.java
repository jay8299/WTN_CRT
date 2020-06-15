package testing1;


/*
  public class proto {
	public static void main(String args[])
	{
		int m=0,x,k = 359861;
		int n=k;
		while(n>0)
		{
			x=n%10;
			m+=x*x*x;
			n/=10;
			
		}
		System.out.println("Arm Strong Number of "+k+" is "+m);
	}

}

 */
		
/*

public class proto {
	public static void main(String args[])
	{
		int m=0,x,k = 64539;
		int n=k;
		while(n>0)
		{
			x=n%10;
			if(x>m)
			{
				m=x;
			}
			n/=10;
			
		}
		System.out.println("Max digit in "+k+" is "+m);
	}

}

*/


/*
public class proto {
	public static void main(String args[])
	{
		int m=0,x,k = 1234;
		int n=k;
		int pow=1;
		while(n>0)
		{
			x=n%10;
			m+=Math.pow((double)x, (double)pow);
			
			n/=10;
			pow++;
			

			
		}
		System.out.println("Max digit in "+k+" is "+m);
	}

}

*/


public class proto {
	public static void main(String args[])
	{
		/*int n=5,k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		*/
		
		/* int [] array = new int []{1,2,3,4,5,6};

		int sum=0;
		
		for(int i: array)
		{
			sum+=i;	
		}
		System.out.print(sum/array.length);
		*/
/*	
	int n=3666;
	int [] array = new int [10];

	int min=100000;
	int max=-100000;
	while(n>0)
	{
		int x=n%10;
		array[x]++;
		n/=10;
	}
	for(int i:array)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
		else if(array[i]<min)
		{
			min=array[i];
		}
	}
	/*for(int i=array.length-1;i>=0;i--)
	{
		System.out.println(array[i]);
	}*/
	/*
	System.out.println(max+" "+min);
	*/
	/*
		int [] a = new int [] {1,2,3,4};
		int [] b = new int [100];
		b=a;
		b[0]=2;
		System.out.print(a[0]+" "+b[0]);
		
	*/
		/*
		
		int [][] a = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = new int [][] {{1,0,0},{0,1,0},{0,0,1}};
		int [][] c = new int[a.length][b.length];    
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];      
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	*/
		int [][] a = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int [][] c = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[(a.length-1)-j][i];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

		
		
	}
		
		

}














