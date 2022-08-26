//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/25/22
//Class - APCSA
//Lab  - Number Verify Lab

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a whole number :: ");
		double x = keyboard.nextDouble();
		
		NumberVerify test = new NumberVerify();
		test.setNumber(x);
		test.isEven();
		test.isOdd();
		out.println(test);
		
	}
}