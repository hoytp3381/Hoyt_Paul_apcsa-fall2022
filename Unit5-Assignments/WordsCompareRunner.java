//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Paul Hoyt
//Date - 8/30/22
//Class - APCSA
//Lab  - WordsCompare Lab

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare();
	   
	   test.setWords("abe", "ape");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("giraffe", "gorilla");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("one", "two");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("fun", "funny");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("123", "19");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("193", "1910");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("goofy", "godfather");
	   test.compare();
	   out.print(test);
	   
	   test.setWords("funnel", "fun");
	   test.compare();
	   out.print(test);
   }
}