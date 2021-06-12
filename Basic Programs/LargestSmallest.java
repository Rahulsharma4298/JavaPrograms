public class LargestSmallest
{
	public static void largest(int[] arr)
	{
		int max = -2147483648;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest in array: "+ max);
	}

	public static void secondLargest(int[] arr)
	{
		int max1 = -2147483648;
		int max2 = -2147483648;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			if(arr[i] > max2 && arr[i] != max1 & arr[i] != max1)
				max2 = arr[i];
		}
		System.out.println("Second Largest in array: "+ max2);
	}

	public static void thirdLargest(int[] arr)
	{
		int max1 = -2147483648;
		int max2 = -2147483648;
		int max3 = -2147483648;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			if(arr[i] > max2 && arr[i] != max1)
			{
				max3 = max2;
				max2 = arr[i];
			}
			if(arr[i] > max3 && arr[i] != max2 & arr[i] != max1)
				max3 = arr[i];
		}
		System.out.println("Third Largest in array: "+ max3);
	}

	public static void smallest(int[] arr)
	{
		int min = 2147483647;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest in array: "+ min);
	}

	public static void secondSmallest(int[] arr)
	{
		int min1 = 2147483647;
		int min2 = 2147483647;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			if(arr[i] < min2 && arr[i] != min1 & arr[i] != min1)
				min2 = arr[i];
		}
		System.out.println("Second smallest in array: "+ min2);
	}

	public static void thirdSmallest(int[] arr)
	{
		int min1 = 2147483647;
		int min2 = 2147483647;
		int min3 = 2147483647;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			if(arr[i] < min2 && arr[i] != min1)
			{
				min3 = min2;
				min2 = arr[i];
			}
			if(arr[i] < min3 && arr[i] != min2 & arr[i] != min1)
				min3 = arr[i];
		}
		System.out.println("Third Smallest in array: "+ min3);
	}

	public static void main(String[] args) {
		int[] arr = {2,1,8,5,4,5};
		largest(arr);
		secondLargest(arr);
		thirdLargest(arr);

		smallest(arr);
		secondSmallest(arr);
		thirdSmallest(arr);
	}
}