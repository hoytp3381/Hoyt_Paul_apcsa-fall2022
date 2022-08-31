//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/31/22
//Class - APCSA
//Lab  - StringEqualityRunner Lab

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		
		test.setWords("hello", "goodbye");
		out.print(test);
		
		test.setWords("one", "two");
		out.print(test);
		
		test.setWords("three", "four");
		out.print(test);
		
		test.setWords("TCEA", "UIL");
		out.print(test);
		
		test.setWords("State", "Champions");
		out.print(test);
		
		test.setWords("ABC", "ABC");
		out.print(test);
		
		test.setWords("ABC", "CBA");
		out.print(test);
		
		test.setWords("same", "same");
		out.print(test);
	}
}