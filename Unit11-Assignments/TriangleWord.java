//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String response = "";
		int x = 1;
		for(int i = 0; i<word.length();i++) {
			for(int j = 0; j<x;j++) {
				response = response + word.substring(0,x);
			}
			x++;
			response = response + "\n";
		}
		System.out.println(response);
	}
}