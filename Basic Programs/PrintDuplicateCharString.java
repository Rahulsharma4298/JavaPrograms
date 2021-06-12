public class PrintDuplicateCharString
{
	public static void getDuplicateChar(String s)
	{
		char[] s1 = s.toCharArray();
		int n = s1.length;
		int count = 0;

		for(int i=0;i<n;i++)
		{
			count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(s1[i] == s1[j] && s1[i] != ' ')
				{
					count++;
					s1[j] = '0';
				}
			}
			if(count > 1 && s1[i] != '0')
				System.out.println(s1[i]);
		}
	}

	public static void main(String[] args) {
		String s = "hello world";
		getDuplicateChar(s);
	}
}