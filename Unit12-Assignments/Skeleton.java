//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*; 

public class Skeleton implements Monster {
	//add instance variables	
	private String Monster;
	private int Height;
	//add a constructor
	public Skeleton() {
		
	}
	public Skeleton(String name, int height) {
		Monster = name;
		Height = height;
	}
	//add code to implement the Monster interface
	public int getHowBig() {
		return Height;
	}
	public String getName() {
		return Monster;
	}
	public boolean isBigger(Monster other) {
		if(this.getHowBig()>other.getHowBig())
			return true;
		return false;
	}
	public boolean isSmaller(Monster other) {
		if(this.getHowBig()<other.getHowBig())
			return true;
		return false;
	}
	public boolean namesTheSame(Monster other) {
		if(this.getName().equals(other.getName()))
			return true;
		return false;
	}
	//add a toString
	public String toString() {
		return "" + Monster + " " + Height;
	}
}