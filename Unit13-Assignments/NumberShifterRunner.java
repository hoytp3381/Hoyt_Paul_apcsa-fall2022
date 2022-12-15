//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		ArrayList<Integer> PP = new ArrayList();
		PP = test.makeLucky7Array(10);
		test.shiftEm(PP);
		System.out.println(PP);
	}
}
