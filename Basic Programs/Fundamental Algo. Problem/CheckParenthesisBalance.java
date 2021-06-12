import java.util.Stack;

/*
Given an expression string, write a python program to find whether a given string has balanced parentheses or not.

Examples:

Input : {[]{()}}
Output : Balanced

Input : [{}{}(]
Output : Unbalanced

One approach to check balanced parentheses is to use stack.
1.Each time, when an open parentheses is encountered push it in the stack.

2.When closed parenthesis is encountered, match it with the top of stack and pop it.

3.If stack is empty at the end, return Balanced otherwise, Unbalanced.

*/
public class CheckParenthesisBalance
{
	public static String check(String s)
	{
		Stack<Character> stack = new Stack<Character>();

		for(int i=0;i<s.length();i++)
		{	
			char x = s.charAt(i);
			if(x == '{' || x == '[' || x == '(')
				stack.push(x);
			
			else if(x == '}')
			{
				if(stack.isEmpty() || stack.pop() != '{')
					return "Unbalanced";
			}
			else if(x == ']')
			{
				if(stack.isEmpty() || stack.pop() != '[')
					return "Unbalanced";
			}
			else if(x == ')')
			{
				if(stack.isEmpty() || stack.pop() != '(')
					return "Unbalanced";
			}
		}
		if(stack.isEmpty())
			return "Balanced";
		return "Unbalanced";
		
	}

	public static void main(String[] args) {
		System.out.println(check("{(a,b)}"));
        System.out.println(check("{(a},b)"));
        System.out.println(check("{)(a,b}"));
	}
}
