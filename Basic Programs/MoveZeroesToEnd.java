// Move all zeroes to end of array
// Example:
// Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
// Output : arr[] = {1, 2, 4, 3, 5, 0, 0};

// Method1:  // Traverse the array. If element encountered is
//           // non-zero, then replace the element at index 'count'
//          // with this element
//   		// Now all non-zero elements have been shifted to
//         // front and 'count' is set as index of first 0.
//         // Make all elements 0 from count to end.

// Method2: (Using single traversal and swapping)

// // Time Complexity: O(n). 
// // Auxiliary Space: O(1).

// Method3: Using Sorting, (bubble sort, quick sort or any other)


public class MoveZeroesToEnd
{	
	//Method1: 
	public static void moveZeroesToEnd(int[] arr)
	{
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] != 0)
			{
				arr[count++] = arr[i];
			}
		}

		while(count < n)
		{
			arr[count++] = 0;
		}

	}

	//Method2: Using swapping and only single traversal
	public static void moveZeroesToEnd2(int[] arr)
	{
		int n = arr.length;
		int count = 0;
		int temp;
		for(int i=0;i<n;i++)
		{
			if(arr[i] != 0)
			{
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count = count + 1;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = {0,1,9,8,4,0,0,2,7,0,6,0,9};
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println("\nBefore above, after below");
		moveZeroesToEnd(arr);
		for(int x: arr)
			System.out.print(x + " ");
}
}