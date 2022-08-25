//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/23/22
//Class - APCSA
//Lab  - Distance Lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(xOne,xTwo,yOne,yTwo);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double x = Math.pow(xTwo-xOne,2);
		double y = Math.pow(yTwo-yOne,2);
		distance = Math.sqrt(x+y);
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + String.format("%.3f", distance);
	}
}