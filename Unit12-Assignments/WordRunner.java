//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\hoytp3381\\Desktop\\APCSA Fall\\Unit 12\\Unit12-Assignments\\words.dat"));

		Word[] size = new Word[file.nextInt()];
		file.nextLine();
		
		for(int i = 0;file.hasNext();i++) {
			size[i] = new Word(file.nextLine());
		}

		Arrays.sort(size);
		
		for(int j = 0; j<size.length;j++) {
			out.println(size[j]);
		}
	}
}