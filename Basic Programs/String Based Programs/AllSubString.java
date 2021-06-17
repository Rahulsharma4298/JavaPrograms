public class AllSubString
{	
	// Method 1 (Using substring() function)
	public static void subString1(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length()+1;j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
	}

	// Method 2 (Generate a substring using previous substring):-
	public static void subString2(String s)
	{
		for(int i=0;i<s.length();i++)
		{	
			String temp = "";
			for(int j=i;j<s.length();j++)
			{
				temp += s.charAt(j);
				System.out.println(temp);
			}
			
		}
	}

	public static void main(String[] args) {
		String s = "abcd";
		subString1(s);
		System.out.println();
		subString2(s);

	}
}