//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class TriangleFive
{
   private char ogltr;
   private int a;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		ogltr = c;
	}

	public void setAmount(int amt)
	{
		a = amt;
	}

	public String toString()
	{
		int count = a;
		int temp = count;
		int k = a;
		char ltr = ogltr;
		String output="";
		for(int i = 0;i<a;i++) {
			for(int g = 0;g<a;g++) {
				for(int j = k;j>0;j--) {
					output = output + ltr;
				}
				if(ltr=='Z')
					ltr='A';
				else
					ltr++;
				k--;
				output = output + " ";
				count--;
				if(count == 0)
					break;
			}
			temp--;
			count = temp;
			k = a;
			ltr = ogltr;
			output = output + "\n";
		}
		return output;
	}
}
