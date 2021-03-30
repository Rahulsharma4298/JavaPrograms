class VarArgDemo
{	
	public static void sum(int... x)
	{	
		int total = 0;
		for(int i=0;i<x.length;i++)
		{
			total += x[i];
		}
		System.out.println("Sum is: "+total);
	}

	public static void main(String[] args) {
		System.out.println("VarArgs came in v1.5");
		sum(); //Even zero no. of arguments also allowed

		sum(1,2,3);
		sum(8,1,1,1,1);

		// We can mix var-arg parameter with general parameters also. 
		// but it should be rightmost
		// sum(int a,int... b) //valid
		// sum(int... x, String s) //invalid

		// More than var args not allowed
		// methodOne(int... a,int... b) //(invalid)

		//Wherever single dimensional array present we can replace with var-arg parameter

		//Which of the following var-arg method declarations are valid?
		/*
		1. methodOne(int... x) (valid)
		2. methodOne(int ...x) (valid)
		3. methodOne(int...x) (valid)
		4. methodOne(int x...) (invalid)
		5. methodOne(int. ..x) (invalid)
		6. methodOne(int .x..) (invalid)
		*/
	}
}