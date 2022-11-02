//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = new String[6];
		vals[0] = "a";
		vals[1] = "x";
		vals[2] = "L";
		vals[3] = "G";
		vals[4] = "y";
		vals[5] = "P";
		Grid test = new Grid(10, 10, vals);
		test.findMax(vals);
		System.out.println(test);
	}
}