package unit;

public class ArrayLargest {
	public int maxArray(int arr[],int n)
	{

		int max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}


}
