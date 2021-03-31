class MainMethodDemo
{	
	// Overloading of the main() method is possible but 
	// JVM always calls string[] argument main() method only.

	public static void main(String[] args) {
		System.out.println("Parent class main method");
		// System.out.println("String[] array main method");
	}

	public static void main(int[] args)
	{	
		System.out.println("overloaded int[] array main method");
	}


}

// Inheritance concept is applicable for static methods including main() method
// hence while executing child class if the child class doesn't contain main() method then
// the parent class main() method will be executed.

// It seems to be overriding concept is applicable for static methods 
// but it is not overriding it is method hiding. 
// Example:-

class Child
{
	public static void main(String[] args) {
		System.out.println("Child class main method");
		// java Child => Child class main method
		// java MainMethodDemo => Parent class main method

	}
}
/*
Valid Declarations:-

1. public static void main(String[] args){}
2. public static void main(String args[]){}
3. public static void main(String... args){}
4. static public void main(String[] args){}
5. static public void main(String args[]){}
6. static public void main(String... args){}

// We can use sychronized, final, strictfp modifiers with main method:-

7. public static synchronized final strictfp void main(String... args){}(valid)

Invalid Declarations:-

1. public static void main(String args){} (invalid) 
2. public synchronized final strictfp void main(String[] args){} (invalid)
3. public static void Main(String... args){} (invalid)
4. public static int main(String[] args){} //int return type we can't take //(invalid)


7. public void main(String[] args){}(invalid)
*/

/*
Untill 1.6v if our class doesn't contain main() method then at runtime we will get
Runtime Exception saying NosuchMethodError:main
But from 1.7 version onwards instead of NoSuchMethodError we will get more
meaning full description
*/

/*
From 1.7 version onwards to start program execution compulsory main method should
be required, hence even though the class contains static block if main method not
available then won't be executed

class Test {
static {
 System.out.println("static block");
}
}

1.6 version :

javac Test.java
java Test
output :
static block
RE: NoSuchMethodError:main

1.7 version :

javac Test.java
java Test
Error: main method not found in class Test, please define the main method
as
public static void main(String[] args)

*/