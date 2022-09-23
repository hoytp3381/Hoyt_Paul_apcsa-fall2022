//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Hoyt

import static java.lang.System.*;

public class Triples
{
   private int x;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{


	}

	public void setNum(int num)
	{
		x = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		return 1;
	}

	public String toString()
	{
		int a,b,c;
		String output="";
		for(int i = 1;i<x;i++) {
			a = i;
			for(int j = 1;j<x;j++) {
				b = j;
				for(int k = 1;k<x;k=k+2) {
					c = k;
					if(((a*a)+(b*b))==(c*c)) {
						if((a+b)%2==1)
						output = output + a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		return output+"\n";
	}
}
