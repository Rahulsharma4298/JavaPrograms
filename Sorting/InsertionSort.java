public class InsertionSort
{
	public static void sort(int[] arr)
	{	
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && key < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void printArray(int[] arr)
	{
		for(int x:arr)
			System.out.print(x + " ");
		System.out.print("\n");
	}

	public static void main(String[] args) {
		int[] arr = {9,1,2,7,5,4,10};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}
}