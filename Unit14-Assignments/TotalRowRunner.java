//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println("Row Totals Are :: " + TotalRow.getRowTotals(new int [][] {{1,2,3},{5,5,5,5}}));
		System.out.println("Row Totals Are :: " + TotalRow.getRowTotals(new int [][] {{1,2,3},{5},{1},{2,2}}));
		System.out.println("Row Totals Are :: " + TotalRow.getRowTotals(new int [][] {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}}));
	}
}



