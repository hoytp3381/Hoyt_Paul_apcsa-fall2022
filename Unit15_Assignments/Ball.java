//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int ht) {
		super(x,y,wid,ht);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	public Ball(int x, int y, int wid, int ht, Color col) {
		super(x,y,wid,ht,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int ht, Color col, int xS, int yS) {
		super(x,y,wid,ht,col);
		xSpeed = xS;
		ySpeed = yS;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	super.draw(window, Color.white);


      setX(getX()+xSpeed);
      setY(getY()+ySpeed);

	super.draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}   

	public int getX() {
		return super.getX();
	}
	public int getY() {
		return super.getY();
	}
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	public void setYSpeed(int y) {
		ySpeed = y;
	}

   public String toString() {
	   return super.toString() + " " + xSpeed + " " + ySpeed;
   }
}