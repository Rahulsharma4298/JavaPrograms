class CommandLineArguments
{
	public static void main(String[] args) {

		// Stored in String[] args
		// The arguments which are passing from command prompt are called command line
		// arguments.
		// The main objective of command line arguments are we can customize the behavior of
		// the main() method. 
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		int total = 0;
		for(int i=0; i<args.length; i++)
		{
			total += Integer.parseInt(args[i]);
		}
		System.out.println("Using CommandLineArguments");
		System.out.println("Sum is: "+total);

	}
}