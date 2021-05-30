//Method 1
//reverses array and stores it in another array

// 1.Function takes array and length of array n
// 2.Take a var j and initialize it with n
// 3.Create new array with size n
// 4.Iterate till n and assign a[i] to b[j-1]
// 5.Decrement j untill loop

// Method2
// The first element is swapped with the last element. The second element id swapped with the last but one element and so on.
// For instance, consider array [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and further.

public class ReverseArray
{	//Method1
	public static void reverse1(int a[], int n)
	{
		int[] b = new int[n];
		int j = n;
		for(int i=0;i<n;i++)
		{
			b[j-1] = a[i];
			j--;
		}
		System.out.println("Reversed Array is: ");
		for(int x:b)
			System.out.print(x + " ");
	}

	public static void reverse2(int a[], int n)
	{
		//Method2
		int t;
		for(int i=0;i<n/2;i++)
		{
			t = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = t;
		}
		System.out.println("\nReversed Array is: ");
		for(int x:a)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		int n = 5;
		int[] a = {1,2,3,4,5};
		ReverseArray.reverse1(a, n);
		ReverseArray.reverse2(a, n);
	}
}