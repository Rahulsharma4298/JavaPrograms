class DataTypes
{
	public static void main(String[] args) {
		byte b = 10;		//1 byte Default - 0
		short s = 20;		//2 byte Default - 0
		char c = 's';		//2 bytes Default - '\s'
		int a = 100; 		//4 bytes
		long l = 115233;	//8 bytes
		float f = 10.5f;		//4 bytes (without f in end, default it will be double type)
		double d = 212.266144; //8 bytes
		boolean z = true; //size not applicable (depends on jvm)
		String str = "Hello World"; //Non Primitive , Object

		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(z);
		System.out.println(str);

		//Integer Literals:-

		//Binary (Prefix with 0b or 0B) (came in v1.7)
		int bin = 0b100;          
		System.out.println(bin); 
		//Decimal
		int dec = 1241;
		System.out.println(dec); 
		//Octal (Prefix with 0)
		int oct = 010;
		System.out.println(oct);
		//Octal (Prefix with 0x or 0X) (Base 16, 0-9, a-f)
		int hexa = 0xface;
		System.out.println(hexa);

		//output will be in eq. decimal for all^

		//Float Literals:-

		/*
		float f=123.456; //C.E:possible loss of precision(invalid)
 		float f=123.456D; //C.E:possible loss of precision(invalid)
 		double d=0x123.456; //C.E:malformed floating point literal(invalid)
		double d=0xFace; (valid)
		double d=0xBeef; (valid)
		*/

		//Char Literal:-

		/*
		char ch='a';	//(valid)
		char ch=a;	//C.E:cannot find symbol(invalid)
		char ch="a";	//C.E:incompatible types(invalid)
		char ch='ab';//C.E:unclosed character literal(invalid)
		*/

		//We can represent a char literal by Unicode representation:-
		//ie

		// char ch='\ubeef';
		// char ch1='\u0061';
		// System.out.println(ch1); //a
		// char ch2=\u0062; //C.E:cannot find symbol
		// char ch3='\iface'; //C.E:illegal escape character
		// Every escape character in java acts as a char literal.

		//Boolean literals::-
		/*
		1. boolean b=true;(valid)
		2. boolean b=0;//C.E:incompatible types(invalid)
		3. boolean b=True;//C.E:cannot find symbol(invalid)
		4. boolean b="true";//C.E:incompatible types(invalid)
		*/

		//The following 2 are enhansements
		//1. Binary Literals
		//2. Usage of '_' in Numeric Literals

		//Using _  symbol in numeric literals :
		double _d = 1_23_456.7_8_9;
		System.out.println(_d);
		
		// We should use underscore symbol only between the digits
		// double d=_1_23_456.7_8_9; //invalid
		// double d=1_23_456.7_8_9_; //invalid
		// double d=1_23_456_.7_8_9; //invalid

		//Smaller data type value can be assigned to bigger data type value, according to that chart-->

		/*
		byte ---> short --->
							int ---> long ----> float ---> double
		char ---->
		*/

		int _i = 'a';
		System.out.println(_i);

	}
}