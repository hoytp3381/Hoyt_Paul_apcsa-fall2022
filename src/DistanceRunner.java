//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/24/22
//Class - APCSA
//Lab  - Distance Lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);	
		
		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance run = new Distance();
		run.setCoordinates(x1,y1,x2,y2);
		run.calcDistance();
		out.print(run);
			
	}
}