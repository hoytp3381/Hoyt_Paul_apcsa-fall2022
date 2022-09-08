//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class Perfect
{
	public Perfect()
	{
	}
   private int number;
   private int total;

	public void setNumber(int n)
	{
		number = n;
		total = 0;
	}

	public boolean isPerfect()
	{
		for(int i = 1; i < number; i++) {
			if(number % i == 0)
				total = total + i;
		}
		if(total == number)
			return true;
		else
		return false;
	}

	public String toString() 
	{
		if(isPerfect() == true)
			return "" + number + " is perfect.";
		else
			return "" + number + " is not perfect.";
	}
	
	
}