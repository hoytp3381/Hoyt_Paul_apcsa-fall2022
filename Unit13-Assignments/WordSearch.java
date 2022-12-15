//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int x,size,row,col;
    private String fin = "";
    public WordSearch( int size, String str )
    {
    	x=0;
    	m = new String[size][size];
    	for(int i = 0;i<size;i++) {
    		for(int j = 0;j<size;j++) {
    			m[i][j]=str.substring(x,x+1);
    			x++;
    		}
    	}
//    	for(int i = 0;i<size;i++) {
//    		for(int j = 0;j<size;j++) {
//    			System.out.print(m[i][j] + "  ");
//    		}
//    		System.out.println();
//    	}
    }

    public boolean isFound( String word )
    {
    	for(int i = 0;i<m.length;i++) {
    		for(int j = 0;j<m[0].length;j++) {
    			if(word.substring(0,1).equals(m[i][j])) {
    				if(checkRight(word,i,j)||checkLeft(word,i,j)||checkUp(word,i,j)||checkDown(word,i,j)||checkDiagUpRight(word,i,j)
    						||checkDiagUpLeft(word,i,j)||checkDiagDownLeft(word,i,j)||checkDiagDownRight(word,i,j))
    					return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(size+c>m[0].length)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(c-size<-1)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col--;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(r-size<-1)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			row--;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(size+r>m.length)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			row++;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(row-size<-1||col+size>m.length)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col++;
			row--;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(r-size<-1||c-size<-1)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col--;
			row--;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(size+row>m.length||c-size<-1)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col--;
			row++;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		x=0;
		row = r;
		col = c;
		size=w.length();
		if(size+row>m.length||size+col>m.length)
			return false;
		for(int i = 0;i<w.length();i++) {
			if(!(m[row][col].equals(w.substring(x,x+1))))
				return false;
			x++;
			col++;
			row++;
		}
		return true;
	}

    public String toString()
    {
    	for(int i = 0;i<m.length;i++) {
    		for(int j = 0;j<m[0].length;j++) {
    			fin = fin + m[i][j] + "  ";
    		}
    		fin = fin + "\n";
    	}
 		return fin;
    }
}
