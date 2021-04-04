class OperatorsDemo
{
	public static void main(String[] args) {
		// increment & decrement operators:-

		int x = 10;
		int y = 5;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		//x++; // post-increment
		System.out.println("on post-increment, value of x: "+x++); // output - 10
		++x; // pre-increment
		System.out.println("after pre-increment, value of x: "+x);
		y--; // post-decrement
		System.out.println("after post-decrement, value of y: "+y);
		--y; // pre-decrement
		System.out.println("after pre-decrement, value of y: "+y);

		// Difference between b++ and b = b+1?
		// If we are applying any arithmetic operators b/w 2 operands 
		// 'a' & 'b' the result type is max(int , type of a , type of b)

		byte a = 1;
		byte b = 2;
		// byte c = a+b; (invalid, because resultant type is int)
		// incompatible types: possible lossy conversion from int to byte
		byte c = (byte)(a+b); // (valid)
		System.out.println(c);

		// In the case of Increment & Decrement operators internal type casting 
		// will be performed automatically by the compiler
		b++; //=> b=(type of b)b+1;
		

		// Some rules:-
		/*
		1.Increment & decrement operators we can apply only for variables
		 but not for constant values else we will get compile time error. 
		
		 int x = 4;
		 int y = ++4; (invalid)
		 System.out.pritnln(y);

		C.E: unexpected type
			 required: varialbe
			 found : value

		2.We can't perform nesting of increment or decrement operator, 
		  other wise we will get compile time error
		  int y = ++(++y); (invalid)
		  System.out.pritnln(y);

		3.For the final variables we can't apply increment or decrement operators,
		   else we will get compile time error.

		4.We can apply increment or decrement operators even for primitive data types
		  except boolean. 
		  char c = 'a';
		  c++;
		  System.out.println(c);
		  output: b

		  double d = 10.5;
		  d++;
		  System.out.println(d);
		  output: 11.5

		  boolean b = true; (invalid)
		  b++;
		  System.out.println(b);
		  CE : operator ++ can't be applied to boolean
		*/

		  // Arithmetic Operators:-
		  // (+,-,/,%) 
		  /*
		  If we apply any Arithmetic operation b/w 2 variables a & b ,
		  the result type is always max(int , type of a , type of b)

		  byte + byte=int
		  byte + short=int
		  short + short=int
		  short + long=long
		  double + float=double
		  int + double=double
		  char + char=int
		  char + int=int
		  char + double=double
		*/

		System.out.println('a' + 'b'); // output : 195
 		System.out.println('a' + 1); // output : 98
 		System.out.println('a' + 1.2); // output : 98.2

 		// In integral arithmetic (byte , int , short , long) there is no way to represents
		// infinity , if infinity is the result we will get the ArithmeticException / by zero

		// System.out.println(10/0); // output RE : ArithmeticException / by zero

		// But in floating point arithmetic(float , double) there is a way represents infinity. 
		// For the Float & Double classes contains the following constants :
		// 1. POSITIVE_INFINITY
		// 2. NEGATIVE_INFINITY

		System.out.println(10/0.0); // output : infinity
		System.out.println(-10/0.0); // output : -infinity

		// But floating point arithmetic (float , double) there is a way to represents
		// undefined the results .
		// For the Float , Double classes contains a constant NaN , Hence the result is
		// undefined we won't get ArithmeticException in floating point arithmetics .
		System.out.println(0.0/0.0); // output : NaN
		System.out.println(-0.0/0.0); // output : NaN
		System.out.println(Float.NaN); // output : NaN

		System.out.println(10 < Float.NaN ); // false
		System.out.println(10 <= Float.NaN ); // false
		System.out.println(10 > Float.NaN ); // false
		System.out.println(10 >= Float.NaN ); // false
		System.out.println(10 == Float.NaN ); // false
		System.out.println(Float.NaN == Float.NaN ); // false
		System.out.println(10 != Float.NaN ); //true
		System.out.println(Float.NaN != Float.NaN ); //true

// ArithmeticException :
// 1. It is a RuntimeException but not compile time error
// 2. It occurs only in integral arithmetic but not in floating point arithmetic.
// 3. The only operations which cause ArithmeticException are : ' / ' and ' % '

		// String Concatenation operator : 
		/*
		1. The only overloaded operator in java is ' + ' operator sometimes acts as 
		arithmetic addition operator & sometimes string contcat.
		2. If acts as one argument is String type , then '+' operator acts as concatenation
		and If both it acts as arithmetic addition operator.
		*/

		String s="rahul";
		int p=10 , q=20 , r=30 ;
		System.out.println(s+p+q+r); //output : rahul102030
		System.out.println(p+q+r+s); //output : 60rahul
		System.out.println(p+q+s+r); //output : 30rahul1020
		System.out.println(p+s+q+r); //output : 10rahul2030

		// s = p+q+r; //(invalid) incompatible type
								// found : int
								// required : java.lang.String
		s = s+p+q+r; //(valid)
		// q = s+q+r; //(invalid)

		// Relational Operators:-

		// We can apply relational operators for every primitive type except boolean

		System.out.println(10 < 10.5); //true
		System.out.println('a' > 100.5); //false
		System.out.println('b' > 'a'); //true
		// System.out.println(true > false); (invalid)
		//CE : operator > can't be applied to boolean , boolean

		// We can't apply relational operators for object types 

		// System.out.println("rahul" > "rahul"); (invalid)
		
		// Nesting of relational operator is not allowed 

		// System.out.println(10 > 20 > 30);

		// Equality Operators : (== , !=) 

		// we can us it with all primitive types 

		System.out.println(10 == 20) ; //false
	    System.out.println('a' == 'b' ); //false
		System.out.println('a' == 97); //true
		System.out.println(false == false); //true

		// We can apply equality operators for object types also .
		// for objects it compares address or reference.

		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1 ;
		System.out.println(t1==t2); //false
		System.out.println(t1==t3); //true

		// To use the equality operators between object type compulsory these should be
		// some relation between argument types(child to parent , parent to child) , 

		Thread t=new Thread();
		Object o=new Object();
		// String s=new String("rahul");
		System.out.println(t==o); //false
		System.out.println(o==s); //false
		// System.out.println(s==t); (invalid)
		// CE : incompatible types : java.lang.String and java.lang.Thread

		// For any object reference of on r==null is always false , 
		// but null==null is always true.

		System.out.println(s==null);   //false
		System.out.println(null==null); //true

		// instanceof Operator:-
		// We can use the instanceof operator to check whether 
		// the given an object is perticular type or not 

		System.out.println(t instanceof Thread); //true
		System.out.println(t instanceof Object); //true

		// To use instance of operator compulsory there should be some relation between
		// argument types (either child to parent Or parent to child Or same type)
		// Otherwise we will get compile time error saying inconvertible types 

		// System.out.println(t instanceof String); //(invalid)

		// Whenever we are checking the parent object is child type or not by using
		// instanceof operator that we get false.

		System.out.println(o instanceof String); //false 
		Object o1=new String("hello");
		System.out.println(o1 instanceof String); //true

		// For any class or interface X null instanceof X is always returns false
	 	// System.out.println(null instanceof X); //false

	 	// Bitwise Operators : ( & , | , ^):-
		// Can be used with both integral and boolean types
		System.out.println(true&false);//false
		System.out.println(true|false);//true
		System.out.println(true^false);//true

		// We can apply bitwise operators even for integral types also.
		// it will be applied bitwise and result will be in integer
		// Example:
		System.out.println(4&5);//4 using binary digits
		System.out.println(4|5);//5  4-->100
		System.out.println(4^5);//1  5-->101

		// Bitwise complement (~) (tilde symbol) operator: 
		// can be applied only for integral types but not for boolean types. 
		// . Example :
		// System.out.println(~true); // CE :opetator ~ can not be applied to boolean
 		System.out.println(~4); //-5

		//  description about above program :
		// 4--> 0 000.......0100 0-----+ve
		// ~4--> 1 111.......1011 1--- -ve
		// 2's compliment of ~4 --> 000....0100 add 1
		// result is : 000...0101 =5 

		// Boolean complement (!) operator:
 		// only for boolean
 		// Example:
		System.out.println(!true);//false
		System.out.println(!false);//true
		// System.out.println(!4); CE : operator ! can not be applied to int


		// Short circuit (&&, ||) operators: 
		// In short circuit operator if decision can be made with one statement,
		// then it will not check second statement, so it is faster compared to
		// bitwise operators

		int _x=10 , _y=15;
 		if(++_x < 13 || ++_y > 17) { 	
 			_x++;
 	    }
 		else {
 			_y++;
 	    }

 		System.out.println(_x+"----"+_y); // 12----15


 		// Assignment Operator:
 		
 		// 1. Simple assignment:
			// Example: int x=10; 

		// 2. Chained assignment:
			// Example1:
		    int p1,p2,p3,p4;
	 		p1=p2=p3=p4=20;
			System.out.println(p1+"-"+p2+"-"+p3+"-"+p4); //20-20-20-20

			// Example2:
			int q2,q3;
			int q1 = q2 = q3 = 30;
			System.out.println(q1+"-"+q2+"-"+q3); //30-30-30

		// We can't perform chained assignment directly at the time of declaration:
			// int a=b=c=d=30 (invalid);
			// CE : can not find symbol
			// symbol : variable b
			// location : class Test

		// 3. Compound assignment:
		// (+=, -=, *=, /=, %=, &=, |=, ^=, >>=, >>>=, <<=)
		// Sometimes we can mixed assignment operator with some other operator
		// to form compound assignment operator. 

			int number=10;
			number +=30;
			System.out.println(number); //40

		// In the case of compound assignment operator internal type casting will be
		// performed automatically by the compiler (similar to increment and
		// decrement operators.)


		// Conditional Operator (? :)

			int z1=(10>20)?30:40;
			System.out.println(z1); //40

			int z2=(10>20)?30:((40>50)?60:70);
			System.out.println(z2); //70

		


	







 		






	

		
	}
}