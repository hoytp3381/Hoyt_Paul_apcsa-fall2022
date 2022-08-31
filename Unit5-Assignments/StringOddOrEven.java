//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/29/22
//Class - APCSA 
//Lab  - StringOddOrEven Lab

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word, value;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
	}

	public void setString(String s)
	{
		word = s;
	}

 	public void isEven()
 	{
 		if(word.length()%2 == 0) {
			value = "Even";
		}
		else {
			value = "Odd";
		}
	}

 	public String toString()
 	{
 		String output="" + word + " is " + value;
 		return output;
	}
}