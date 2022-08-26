//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*; 
import java.util.Scanner;
import java.math.RoundingMode;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a==b) {
			return a * b;
		}
		else if(a > b) {
			return a - b;
		}
		else {
			return (b - a);
		}
	}
}