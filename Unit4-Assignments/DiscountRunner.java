//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/25/22
//Class - APCSA
//Lab  - Discount Lab

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		Discount test = new Discount();
		test.setCoordinates(amt);
		test.getDiscountedBill();
		out.print(test);
	}
}