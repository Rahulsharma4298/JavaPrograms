public class QuickSort
{
	public static int partition(int[] arr, int start, int end)
	{
		int pivotIndex = start;
		int pivot = arr[pivotIndex];

		while(start < end)
		{
			while(start < arr.length && arr[start] <= pivot)
				start++;

			while(arr[end] > pivot)
				end--;

			if(start < end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}

		int temp = arr[end];
		arr[end] = arr[pivotIndex];
		arr[pivotIndex] = temp;
		return end;
	}

	public static void quickSort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			int pi = partition(arr, start, end);
			quickSort(arr, start, pi-1);
			quickSort(arr, pi+1, end);
		}
	}

	public static void printArray(int[] arr)
	{
		for(int x: arr)
			System.out.print(x + " ");
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] arr = {4,1,2,8,10,1,14,87,14,45,2,5};
		printArray(arr);
		int n = arr.length-1;
		quickSort(arr, 0, n);
		printArray(arr);
	}
}