//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int x = 1;
		int y;
		int spot = 0;
		int save = -1;
		int r = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ')
				x++;
		}
		wordRay = new String[x];
		for(int j = 0;j<wordRay.length;j++) {
			String a = "";
			y = 0;
			spot = save+1;
			r = 0;
			for(int k = spot;k<sentence.length();k++) {
				if(r==0&&sentence.charAt(k)==' ') {
					save = k;
					r++;
				}
				if(y==0&&sentence.charAt(k)!=' ')
					a = a+sentence.charAt(k);
				else
					y = 1;
			}
			wordRay[j] = a;
		}
//		for(int o = 0;o<wordRay.length;o++) {
//			System.out.println(wordRay[o]);
//		}
//		System.out.println("\n");
	}

	public void sort()
	{
	}

	public String toString()
	{
		String output="";
		for(int i = 1;i<wordRay.length;i++) {
			for(int j = 1;j<wordRay.length;j++) {
				if(wordRay[j].compareTo(wordRay[j-1])<0) {
					String temp = wordRay[j];
					wordRay[j] = wordRay[j-1];
					wordRay[j-1] = temp;
				}
			}
		}
		for(int k = 0;k<wordRay.length;k++) {
			output = output + wordRay[k] + "\n";
		}
		return output+"\n";
	}
}
