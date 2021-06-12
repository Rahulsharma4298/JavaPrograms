import java.util.HashMap;

public class RemoveDuplicateArray
{
	public static void removeDuplicate(int[] arr, int n)
	{
		HashMap <Integer, Boolean> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.get(arr[i]) == null)
			{
				System.out.print(arr[i] + " ");
				map.put(arr[i], true);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,1,2,1,9,3,5,3,2};
		removeDuplicate(arr, arr.length);
	}
}
