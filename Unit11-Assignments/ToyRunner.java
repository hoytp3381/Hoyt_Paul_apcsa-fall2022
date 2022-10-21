//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy();
		test.setName("Sorry");
		test.setCount(1);
		System.out.println(test);
		test.setName("Gi Joe");
		test.setCount(5);
		System.out.println(test);
	}
}