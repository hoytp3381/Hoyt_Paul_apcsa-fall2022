//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/25/22
//Class - APCSA
//Lab  - Discount Lab

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	private double bill;
	public void setCoordinates(double amt) 
	{
		bill = amt;
	}
	public void getDiscountedBill()
	{
		if(bill > 2000) {
			bill = 0.85 * bill;
		}
		else {
			bill = bill;
		}
	}
	public String toString() {
		return "Bill after discount :: " + String.format("%.2f", bill);
	}
}