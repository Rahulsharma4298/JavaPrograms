// If array is sorted -

// Method 1: (Using extra space) 
// Create an auxiliary array temp[] to store unique elements.
// Traverse input array and one by one copy unique elements of arr[] to temp[]. Also keep track of count of unique elements. Let this count be j.
// Copy j elements from temp[] to arr[] and return j
// Time Complexity : O(n) 
// Auxiliary Space : O(n)

// Method 2: (Constant extra space) 
// Just maintain a separate index for same array as maintained for different array in Method 1.
// Time Complexity : O(n) 
// Auxiliary Space : O(1)
 

public class RemoveDuplicateArraySorted
{
	public static int removeDuplicate1(int[] arr, int n)
	{
		if(n == 0 && n == 1)
			return n;

		int[] temp = new int[n];
		int j = 0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for(int i=0;i<j;i++)
		{
			arr[i] = temp[i];
		}

		return j; 	//return new length
	}

	public static int removeDuplicate2(int[] arr, int n)
	{
		if(n == 0 && n == 1)
			return n;

		int j = 0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j; 	//return new length
	}



	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n = removeDuplicate2(arr, arr.length);

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
