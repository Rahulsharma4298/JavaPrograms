class OperatorsDemo2{
	public static void main(String[] args) throws Exception{
		// new operator : 
		// We can use "new" operator to create an object.
		// Student s = new Student();

		// Java operator precedence:
		/*
		1. Unary operators: [] , x++ , x-- , ++x , --x , ~ , ! , new , <type>
		2. Arithmetic operators : * , / , % , + , - .
		3. Shift operators : >> , >>> , << .
		4. Comparision operators : <, <=,>,>=, instanceof.
		5. Equality operators: == , !=
		6. Bitwise operators: & , ^ , | .
		7. Short circuit operators: && , || .
		8. Conditional operator: (?:)
		9. Assignment operators: += , -= , *= , /= , %= . . . 
		*/

		// Evaluation order of java operands:

		// There is no precedence for operands before applying any 
		// operator all operands will be evaluated from left to right

		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));


		// output:-
		// 1
		// 2
		// 3
		// 4
		// 5
		// 6
		// 12

		// new Vs newInstance() : 

		// 1. new is an operator to create an objects , if we know class name at the beginning
		// then we can create an object by using new operator .
		// 2. newInstance( ) is a method presenting class " Class " , which can be used to
		// create object.
		// 3. If we don't know the class name at the beginning and its available dynamically
		// Runtime then we should go for newInstance() method 

		Object o = Class.forName(args[0]).newInstance();
		System.out.println("object created for: "+o.getClass().getName());

		// java ClassFileName java.lang.String
		// output: String

		// If dynamically provide class name is not available then we will get the
		// RuntimeException saying ClassNotFoundException

		// To use newInstance() method compulsory corresponding class should contains
		// no argument constructor , otherwise we will get the RuntimeException saying
		// InstantiationException


		// Difference between instanceof and isInstance() :

		// instanceof an operator which can
		// be used to check whether the
		// given object is perticular type or
		// not
		// We know at the type at beginning
		// it is available

		// isInstance() is a method , present in class Class , we
		// can use isInstance() method to checked whether the
		// given object is perticular type or not
		// We don't know at the type at beginning it is available
		// Dynamically at Runtime.

		// Example of instanceof: 
		String s = new
		String("ashok");
		System.out.println(s instanceof Object); //true

		// Example of isInstance():
		Thread t = new Thread(); 
		System.out.println(Class.forName(args[0]).isInstance(t)); //true





	}

	public static int m1(int i)
		{
			System.out.println(i);
			return i;
		}
}

class Student
{

	Student(){
		System.out.println("Studen class no-arg constructor");
	}

	Student(int sid){
		System.out.println("sid");
	}
}