//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt
//Date - 8/22/22

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double x = x2-x1;
		double y = y2-y1;
		return y/x;
	}

}