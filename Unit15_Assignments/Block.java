//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos = 100;
	private int yPos = 150;
	private int width = 10;
	private int height = 10;

	private Color color = Color.black;

	public Block()
	{


	}
	public Block(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public Block(int x, int y, int wid, int ht) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int wid, int ht, Color col) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}
   //add the other set methods
    public void setPos( int x, int y) {
    	xPos = x;
    	yPos = y;
    }
    public void setX( int x ) {
    	xPos = x;
    }
    public void setY( int y ) {
    	yPos = y;
    }

    public int getX() {
    	return xPos;
    }
    public int getY() {
    	return yPos;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public Color getColor() {
    	return color;
    }
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		return this == other;
	}   

   //add the other get methods
    

	public String toString() {
		return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + "\n" + getColor();
	}
}