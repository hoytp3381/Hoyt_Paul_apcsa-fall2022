//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class
import static java.lang.System.*;

public class NumberShifter
{
	public static ArrayList<Integer> makeLucky7Array( int size)
	{
		int x = 0;
		ArrayList<Integer> LL = new ArrayList();
		for(int i = 0;i<size;i++) {
			x = (int)((Math.random()*10)+1);
			LL.add(x);
		}
		return LL;
	}
	public static void shiftEm(ArrayList<Integer> array)
	{
		for(int i = 0;i<array.size();i++) {
			if(array.get(i)==7) {
				array.remove(i);
				array.add(0,7);
			}
		}
	}
}
