//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore t = new ToyStore();
		t.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		t.sortToysByCount();
		System.out.println(t);
	}
}