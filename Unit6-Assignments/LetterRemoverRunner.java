//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am",'a');
		out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss",'s');
		out.println(test);
		
		test.setRemover("qwertyqwertyqwerty",'a');
		out.println(test);
		
		test.setRemover("abababababa",'b');
		out.println(test);
		
		test.setRemover("abaababababa",'x');
		out.println(test);
	}
}