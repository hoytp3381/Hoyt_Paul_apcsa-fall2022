//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int x = number;
		while(x>0) {
			count++;
			x = x/10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int y = getNumDigits(number);
		int z = number;
		int temp;
		int[] sorted = new int[y];
		for(int i = 0;i<sorted.length;i++) {
			sorted[i] = z%10;
			z = z/10;
		}
//		System.out.println(sorted[0]);
		for(int j = 1; j<sorted.length;j++) {
			for(int k = 1;k<sorted.length;k++) {
				if(sorted[k]<sorted[k-1]) {
					temp = sorted[k];
					sorted[k] = sorted[k-1];
					sorted[k-1] = temp;
				}
			}
		}
//		System.out.println(sorted[0]);
		return sorted;
	}
}
