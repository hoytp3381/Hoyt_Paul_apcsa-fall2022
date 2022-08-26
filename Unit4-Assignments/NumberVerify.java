//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date -  8/25/22
//Class - APCSA
//Lab  - Number Verify Lab

import static java.lang.System.*;

public class NumberVerify
{
	private double num;
	private boolean Even, Odd;
	public void setNumber(double x)
	{
		num = x;
	}
	public void isEven()
	{
		if(num %2 == 0) {
			Even = true;
		}
		else {
			Even = false;
		}
	}	
	public void isOdd()
	{
		if(num %2 == 0) {
			Odd = false;
		}
		else {
			Odd = true;
		}
	}
	public String toString() {
		return "" + num + " is Even :: " + Even + "\n" + num + " is Odd :: " + Odd;
	}
}