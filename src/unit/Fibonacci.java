package unit;

public class Fibonacci {
	public static int[] fibonacci(int n)
	{
		int arr[]=new int[n];
		if(n==1)
		{	arr[0]=0;
			return arr;
		}
		else 
		{
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr;
		}
		
	}
	

}
