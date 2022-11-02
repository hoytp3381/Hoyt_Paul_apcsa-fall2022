//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count = 0;
    	List<Integer> total = new ArrayList<Integer>();
    	for(int i = 0;i<m.length;i++) {
    		for(int j = 0;j<m[i].length;j++) {
    			count = count + m[i][j];
    		}
    		total.add(count);
    		count = 0;
    	}
		return total;
    }
    public String toString() {
    	return "Row Totals Are :: ";
    }
}
