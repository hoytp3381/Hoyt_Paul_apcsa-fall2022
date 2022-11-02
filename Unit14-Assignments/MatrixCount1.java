//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
	private int x,y;
    private int[][] m = {{ 1, 2, 3, 4, 5},
    					{ 6, 7, 8, 9, 0},
    					{ 6, 7, 1, 2, 5},
    					{ 6, 7, 8, 9, 0},
    					{ 5, 4, 3, 2, 1}};
    public int count( int val  )
    {
    	y = val;
		x = 0;
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[i].length;j++) {
				if (m[i][j]==val)
					x++;
			}
		}
		return x;
    }
    public void Matrix() {
    	String Matrix = "";
    	for(int i = 0;i<m.length;i++) {
    		for(int j = 0;j<m[i].length;j++) {
    			Matrix = Matrix + m[i][j] + "   ";
    		}
    		Matrix = Matrix + "\n";
    	}
    	System.out.println(Matrix);
    }
    	
    public String toString() {
    	return "The count of " + y + " is :: " + x;
    }
}
