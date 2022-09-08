//(c) A+ Computer Science
//www.apluscompsci.com
//Name Paul Hoyt

import static java.lang.System.*;

public class Word
{
	private String word,backword;

	public Word()
	{
	}

	public Word(String s)
	{
	}

	public void setString(String s)
	{
		word = s;
		backword = "";
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		for(int i = word.length()-1;i>0;i--) {
			backword += word.charAt(i);
		}
		return backword;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + getFirstChar() + "\n" + word + "\n";
	}
}