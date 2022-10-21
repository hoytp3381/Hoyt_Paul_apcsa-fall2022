//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		pups[spot] = new Dog(age,name);
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		Dog old = pups[0];
		for(int i=0;i<pups.length;i++) {
			if(old.getAge()<pups[i].getAge())
				old = pups[i];
		}
		return old.getName();
	}

	public String getNameOfYoungest()
	{
		Dog young = pups[0];
		for(int i = 0;i<pups.length;i++) {
			if(young.getAge()>pups[i].getAge())
				young = pups[i];
		}
		return young.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}