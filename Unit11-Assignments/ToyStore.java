//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for( String name : toys.split(" ")) {
			Toy t = getThatToy(name);
			if(t==null)
				toyList.add(new Toy(name));
			else
				t.setCount(t.getCount()+1);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0;i<toyList.size();i++) {
  			if(toyList.get(i).getName().equals(nm))
  				return toyList.get(i);
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int maxN = 0;
  		String maxS = "";
  		for(int i = 0;i<toyList.size();i++) {
  			if(toyList.get(i).getCount()>=maxN) {
  				maxS=toyList.get(i).getName();
  				maxN = toyList.get(i).getCount();
  			}
  		}
  		return maxS;
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int i = 1;i<toyList.size();i++) {
  			if(toyList.get(i).getCount()>toyList.get(i-1).getCount())
  				Collections.swap(toyList,i,i-1);
  		}
  	}  
  	  
	public String toString()
	{
	   return "" + toyList + "\n" + "Max == " + getMostFrequentToy();
	}
}