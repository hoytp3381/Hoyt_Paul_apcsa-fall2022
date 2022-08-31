//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt
//Date - 8/29/22


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if(a.substring(0,1).equals("a") || a.substring(0,1).equals("e") || a.substring(0,1).equals("i") || a.substring(0,1).equals("o") || a.substring(0,1).equals("u"))
	   {
		   return "yes";
	   }
	   else if(a.substring(0,1).equals("A") || a.substring(0,1).equals("E") || a.substring(0,1).equals("I") || a.substring(0,1).equals("O") || a.substring(0,1).equals("U"))
	   {
		   return "yes";
	   }
	   else if(a.substring(a.length()-1).equals("a") || a.substring(a.length()-1).equals("e") || a.substring(a.length()-1).equals("i") || a.substring(a.length()-1).equals("o") || a.substring(a.length()-1).equals("u"))
	   {
		   return "yes";
	   }
	   else if(a.substring(a.length()-1).equals("A") || a.substring(a.length()-1).equals("E") || a.substring(a.length()-1).equals("I") || a.substring(a.length()-1).equals("O") || a.substring(a.length()-1).equals("U"))
	   {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}