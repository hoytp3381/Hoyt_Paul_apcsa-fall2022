//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if(num>0) {
			if(num%2==0) {
				return 1 + countOddDigits(num/10);
			}
			return countOddDigits(num/10);
		}
		return 0;
	}
}