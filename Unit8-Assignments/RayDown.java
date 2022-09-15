//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		if(numArray.length==1)
			return true;
		int temp = numArray[0];
		for(int i = 0;i<numArray.length;i++) {
			if(temp>numArray[i+1])
				temp = numArray[i+1];
				if ((i+1) == numArray.length-1)
					return true;
			if(temp<numArray[i+1])
				return false;
		}
		return false;
	}	
}