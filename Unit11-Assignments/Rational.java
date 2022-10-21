//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num1,den1,v,w,x,y;
	private int z = 1;
	//write two constructors
	public Rational() {
		num1=1;
		den1=1;
	}
	public Rational(int x, int y) {
		num1 = x;
		den1 = y;
	}

	//write a setRational method
	public void setRational(int rOne, int rTwo) {
		num1 = rOne;
		den1 = rTwo;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int x) {
		num1 = x;
	}
	public void setDenominator(int y) {
		den1 = y;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num1 = (this.getNumerator() * other.getDenominator()) + (other.getNumerator()*this.getDenominator());
		den1 = this.getDenominator()*other.getDenominator();

		reduce();
	}

	private void reduce()
	{
		w = gcd(num1,den1);
		num1 = num1/w;
		den1 = den1/w;
		if(den1==num1) {
			den1=1;
			num1=1;
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		x = numOne;
		y  = numTwo;
//		System.out.println(x + " " + y);
		for(int i = 1;i<=x;i++) {
			if((x%i==0)&&(y%i==0))
				z = i;
		}
		return z;
		
	}

	public Object clone ()
	{
		Rational clone = new Rational(num1,den1);
		return clone;
//		num1=this.getNumerator();
//		den1=this.getDenominator();
//		return "" + num1 + "/" + den1;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num1;
	}
	public int getDenominator() {
		return den1;
	}
	public boolean equals( Object obj)
	{
//		System.out.println("" + num1 + "/" + den1 + " " + obj);
		if(this.compareTo((Rational) obj) == 0)
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
//		System.out.println(other);
		this.reduce();
		other.reduce();
		if((this.getNumerator()==other.getNumerator())&&(this.getDenominator()==other.getDenominator()))
			return 0;
		if((this.getNumerator()*10/this.getDenominator()*10)>(other.getNumerator()*10/other.getDenominator()*10))
			return 1;
		return -1;
	}



	
	public String toString() {
		return "" + num1 + "/" + den1;
	}
	
	
}
