//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }
   public void UnitedStatesFlag()
   {
	   out.println("The USA Flag");
	   printTwoBlankLines();
	   out.println("* * * * * *----------------------------------");
	   out.println(" * * * * * ----------------------------------");
	   out.println("* * * * * *----------------------------------");
	   out.println(" * * * * * ----------------------------------");
	   out.println("* * * * * *----------------------------------");
	   out.println("---------------------------------------------");
	   out.println("---------------------------------------------");
	   out.println("---------------------------------------------");
	   out.println("---------------------------------------------");
	   out.println("---------------------------------------------");
   }
   public void printSixStars()
   {
	   out.print("* * * * * *");
	   smallDashLine();
   }
   public void printFiveStars()
   {
	   out.print(" * * * * * ");
	   smallDashLine();
   }
   public void smallDashLine()
   {
	   out.println(" ------------------------------------");
   }
   public void bigDashLine()
   {
	   out.println("------------------------------------------------");
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("                      ");
	   out.println("                      ");
   }
   
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}