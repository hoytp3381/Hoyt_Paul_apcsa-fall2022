//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt
//Date - 9/14/22

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int total = 0;
		int w = -1;
		int x = -1;
		for(int i = 0;i<ray.length;i++) {
			if(ray[i]%2==1) {
				x = i;
				for(int j = x;j<ray.length;j++) {
					if(ray[j]%2==0) {
						w = j;
						break;
					}
				}
				break;
			}
		}
		if((x>-1)&&(w>-1)) {
			total = w-x;
			return total;
		}
		else {
			total = -1;
			return total;
		}
	}
}