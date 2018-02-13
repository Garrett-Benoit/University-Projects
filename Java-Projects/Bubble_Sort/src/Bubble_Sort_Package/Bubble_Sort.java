package Bubble_Sort_Package;

public class Bubble_Sort {

	public static void main(String[] args)
	{
	
		int i;
		int j;
		int temp;
		int n = 0;
		int[] A = {89, 45, 68, 90, 29, 34, 17};
		
		System.out.printf("The array before sorting is: %s", A);
		
		for(i=0; i<=n-2; i++)
		{
			for(j=0; j<=n-2-i; j++)
			{
				if(A[j] > A[j+1])
				{
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
		System.out.printf("\nThe array after sorting is: %s", A);

	}

}
