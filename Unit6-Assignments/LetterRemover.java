//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence = "";
   private String cleaned = "";
   private char lookFor;

	public LetterRemover()
	{
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		cleaned = "";
	}

	public String removeLetters()
	{
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)!=lookFor)
				cleaned = cleaned + sentence.charAt(i);
		}
		return cleaned;
	}

	public String toString()
	{
		removeLetters();
		return "" + sentence + " - letter to remove " + lookFor + "\n" + cleaned;
	}
}