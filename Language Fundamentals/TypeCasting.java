class TypeCasting
{
	public static void main(String[] args) {
		//Smaller data type value can be assigned to bigger
		//data type and it is automatically converted

		/*
		byte ---> short --->
							int ---> long ----> float ---> double
		char ---->
		*/
		//Implicit/WideningTypeCasting/Upcasting:


		int x = 7;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z); 


		// Explicit/NarrowingTypeCasting/Down Casting:
		// There may be a chance of lose of information in this type casting

		// When ever we are assigning higher datatype value to lower datatype value
		// variable by explicit type-casting ,the most significant bits will be lost i.e., we have
		// considered least significant bits(left side). 

		int b1=130;
		byte b2=(byte)x;
		System.out.println(b2); //-126

		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i); 

		// When ever we are assigning floating point value to the integral types by explicit
		// type casting , the digits of after decimal point will be lost 

		// When 2 or more data added together, the resultant
		// data type will be according to this- 
		// max(int, type_of_a, type_of_b, ...)
		//ie:-

		byte a = 10;
		byte b = 20;
		//byte c = a + b;
		//error: incompatible types: possible lossy conversion from int to byte

		// Resultant will be of int type, so it need to be converted to bye explicitly
		byte c = (byte)(a + b);
		System.out.println(c);

		char _c = 'b';
		double _d = 90.32;
		double resultant = _c + d;
		System.out.println(resultant); 
		// Op -> 264.65999999999997
		// Resultant will be of double type as it is bigger among int and others

	}
}