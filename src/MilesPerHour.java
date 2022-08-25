//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours;
	private double mph, dis, minu, ours, minutes;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		minu = minutes/60;
		ours = minu + hours;
		dis = distance/ours;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "" + distance + " Miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(dis) + " MPH";
	}
}