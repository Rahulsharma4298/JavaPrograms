public class SelectionSort
{
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min_index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min_index] > arr[j])
				{
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}

	public static void printArray(int arr[])
	{
		for(int x:arr)
			System.out.print(x + " ");
		System.out.print("\n");
	}


	public static void main(String[] args) {
		int[] arr = {1,4,2,25,9,2,7,5};
		SelectionSort.printArray(arr);
		SelectionSort.sort(arr);
		SelectionSort.printArray(arr);
	}

}