//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/29/22
//Class - APCSA
//Lab  - StringOddOrEven Lab

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String s = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven();
		test.setString(s);
		test.isEven();
		out.print(test);
		
	}
}