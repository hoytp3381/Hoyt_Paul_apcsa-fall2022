//(c) A+ Computer Science
//www.apluscompsci.com
//Name Paul Hoyt

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		test.setString("Hello");
		out.print(test);
		
		test.setString("World");
		out.print(test);
		
		test.setString("JukeBox");
		out.print(test);
		
		test.setString("TCEA");
		out.print(test);
		
		test.setString("UIL");
		out.print(test);
	}
}