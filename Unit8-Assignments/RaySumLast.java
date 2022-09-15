//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt
//Date - 9/14/22

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int lastVal = ray[ray.length-1];
		int total = 0;
		for(int i = 0; i<ray.length-1;i++) {
			if(ray[i] > lastVal)
				total = total + ray[i];
		}
		if(total == 0)
			total --;
		return total;
	}
}