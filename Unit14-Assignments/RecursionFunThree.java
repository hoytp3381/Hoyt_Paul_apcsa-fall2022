//� A+ Computer Science  -  www.apluscompsci.com
//Name - Paul Hoyt
//Date - 10/31/22
//Class - APCSA
//Lab  - RecursionFunThree

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		if(number>10) {
			if(number%10==3) {
				return 1 + luckyThrees(number/10);
			}
			else 
				return luckyThrees(number/10);
		}
		else
			return 0;
	}
}