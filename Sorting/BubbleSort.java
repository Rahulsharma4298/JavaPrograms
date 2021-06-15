public class BubbleSort
{
	public static void sort(int[] arr)
	{	
		for(int i=0;i<arr.length-1;i++)
		{	
			boolean swapped = false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
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
		BubbleSort.printArray(arr);
		BubbleSort.sort(arr);
		BubbleSort.printArray(arr);
	}
}