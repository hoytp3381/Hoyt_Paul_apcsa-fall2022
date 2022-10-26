//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Skeleton spooky = new Skeleton();
		
		String name1,name2;
		int height1,height2;
		//ask for name and size
		out.println("What is the name of Monster 1? :: ");
		name1 = keyboard.next();
		out.println("What is the height of Monster 1? :: ");
		height1 = keyboard.nextInt();
		//instantiate monster one
		//ask for name and size
		out.println("What is the name of Monster 2? :: ");
		name2 = keyboard.next();
		out.println("What is the height of Monster 2? :: ");
		height2 = keyboard.nextInt();
		//instantiate monster two
		Skeleton Mike = new Skeleton(name1,height1);
		out.println("Monster 1 - " + Mike);
		Skeleton Juan = new Skeleton(name2,height2);
		out.println("Monester 2 - " + Juan);
		
		if(Mike.isBigger(Juan)==true)
			out.println("Monster 1 is Bigger than Monster 2");
		
		else if(Mike.isSmaller(Juan)==true)
			out.println("Monster 1 is Smaller than Monster 2");
		
		else
			out.println("Monster 1 is the Same Size as Monster 2");
		
		if(Mike.namesTheSame(Juan)==true)
			out.println("Monster 1 has the Same Name as Monster 2");
		
		else
			out.println("Monster 1 does not have the Same Name as Monster 2");
	}
}