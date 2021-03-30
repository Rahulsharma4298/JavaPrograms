class ArrayDemo
{	
	// An array is an indexed collection of fixed number of homogeneous data elements
	public static void main(String[] args) {
		//Declaration, construction & initialization
		//Single dimensional array declaration:

		int[] a;//recommended to use because name is clearly separated from the type, default value will be null
		int []b;
		int c[];
		// All above are valid
		// At the time of declaration we can't specify the size otherwise we will get compile time error
		// Example:
		// int[] a;//valid
		// int[5] a;//invalid

		a = new int[5]; 		// construction

		//int[] _a = new int[5]; // construction & Declaration together

		//Initialization:-
		a[0] = 10;
		a[1] = 20;
		a[3] = 30;
		a[4] = 40;

		System.out.println(a); // [I@somehexvalue
		System.out.println(a[0]); 
		// Note: Whenever we are trying to print any object reference internally toString() method
		// will be executed which is implemented by default to return the following.
		// classname@hexadecimalstringrepresentationofhashcode

		/*
			Note: if we are trying to access array element with out of range index we will get
			Runtime Exception saying ArrayIndexOutOfBoundsException.
		*/

		// Declaration, construction & initialization in single line:-

		char[] ch={'a','e','i','o','u'};
		String[] s={"rahul","rj","star","royal"};


		// Two dimensional array declaration:
		// Example:
		// int[] a;
		// int [][]a;
		// int a[][]; All are valid.(6 ways)
		// int[] []a;
		// int[] a[];
		// int []a[];

		// Three dimensional array declaration:
		// Example:
		// int[][][] a;
		// int [][][]a;
		// int a[][][];
		// int[] [][]a;
		// int[] a[][]; All are valid.(10 ways)
		// int[] []a[];
		// int[][] []a;
		// int[][] a[];
		// int []a[][];
		// int [][]a[];

		// Which of the following declarations are valid?
		int[] a1,b1; //a-1,b-1 (valid)
		int[] a2[],b2; //a-2,b-1 (valid)
		int[] []a3,b3; //a-2,b-2 (valid)
		// int[] a,[]b; //C.E: expected (invalid)
		// Note :
		// If we want to specify the dimension before the variable that rule is applicable only for
		// the 1st variable.

		//int[][] x= new int[2][];

		//Whenever we are creating an array every element is initialized with default value
		//automatically. 

		//If we want to use this short cut compulsory we should perform declaration,
		//construction and initialization in a single line.

		int[][] x = {{1,2}, {3,4}};
		//int[][][] _x ={{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};

		 //#######Printing Array using for loop#######

		System.out.println("Printing 1D array using for loop");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}


		System.out.println("Printing 1D array using for each loop");
		for(int __a: a)
		{
			System.out.println(__a);
		}


		System.out.println("Printing 2D array using for loop");
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<x.length; j++)
			{
				System.out.println(x[i][j]);
			}
		}

		System.out.println("Printing 2D array using for each loop");
		for(int x2[]: x)
		{
			for(int x1: x2)
			{
				System.out.println(x1);
			}
		}


		//length is used to get size of array
		// There is no direct way to find total size of multi dimentional array but indirectly we can
		// find as follows
		// x[o].length +x[1].length+x[2].length + ....... 

		//Anonymous Array:-
		//-Array without Name
		//-For instant one use
		//Example:-

		// At the time of anonymous array creation we can't specify the size otherwise we
		// will get compile time error.

		// new int[]{10,20,30,40};			//(valid)
		// new int[][]{{10,20},{30,40}};	//(valid)

		System.out.println(sum(new int[]{10,20,30,40}));

		//Array elements assignment:-

		// 1)In the case of primitive array as array element any type is allowed which can be
		// 	promoted to declared type. 

		int[] $a=new int[10];
		$a[0]=97;//(valid)
		$a[1]='a';//(valid)
		byte $b=10;
		$a[2]=$b;//(valid)
		short $s=20;
		$a[3]= $s;//(valid)
		//a[4]=10l; //C.E:possible loss of precision

		// 2)In the case of Object type arrays as array elements we can provide either declared type
		// 	objects or its child class objects.

		Number[] n=new Number[10];
		n[0]=new Integer(10);//(valid)
		n[1]=new Double(10.5);//(valid)
		// n[2]=new String("bhaskar");//C.E:incompatible types//(invalid)

		// 3)In the case of interface type arrays as array elements we can provide its implemented
		// class objects

		// 4) In the case of abstract class type array, its child class type array allowed

		Runnable[] r=new Runnable[10];
		r[0]=new Thread();
		//r[1]=new String("bhaskar");//C.E: incompatible types

		// Array variable assignments:

		//1)Element level promotions are not applicable at array object level.
		// Example:
		// int[] a={10,20,30};
		// char[] ch={'a','b','c'};
		// int[] b=a;//(valid)
		// int[] c=ch;//C.E:incompatible types(invalid)

		// 2)In the case of object type arrays child type array can be assign to parent type
		// array variable.
		// Example:
		// String[] s={"A","B"};
		// Object[] o=s;

		// 3) Whenever we are assigning one array to another array internal 
		// elements won't be copy just reference variables will be reassigned
		int[] a5={10,20,30,40,50,60,70};
		int[] b5={80,90};
		System.out.println("a5: "+a5);
		System.out.println("b5: "+b5);
		a5=b5;//(valid)
		b5=a5;//(valid)
		System.out.println("a5: "+a5);
		System.out.println("b5: "+b5);

		// 4)Whenever we are assigning one array to another array dimensions must be matched
		// that is in the place of one dimensional array we should provide the same type only
		// otherwise we will get compile time error.

		// Some array facts:
		/*
		*It is legal to have an array with size zero in java.
		*If we are taking array size with -ve int value then we will 
		  get runtime exception saying NegativeArraySizeException
		*The allowed data types to specify array size are byte, short, char, int.
		*By mistake if we are using any other type we will get compile time error
		*The maximum allowed array size in java is maximum value of int size [2147483647]. 
		*Once we created an array every element is always initialized with default values
		irrespective of whether it is static or instance or local array. 
		*/
		 
 

	}

	public static int sum(int[] x)
	{
		int total=0;
		for(int x1:x)
		{
		total=total+x1;
		}	
		return total;
	}
}