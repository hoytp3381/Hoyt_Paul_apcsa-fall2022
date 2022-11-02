//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Hoyt

public class Grid
{
   private String[][] grid;
   public int x,count,max;
   public String save;
   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				x = (int)(Math.random()*(vals.length));
				grid[i][j]=vals[x];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		max = 0;
		save = "";
		for(int i = 0;i<vals.length;i++) {
			if (countVals(vals[i])>max) {
				max = countVals(vals[i]);
				save = vals[i];
			}
		}
		return save;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		count = 0;
		for(int i = 0;i<grid.length;i++) {
			for(int j = 0;j<grid[i].length;j++) {
				if(grid[i][j]==val)
					count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
//		System.out.println(grid.length);
//		System.out.println(grid[0].length);
//		System.out.println(grid[8].length);
//		System.out.println(grid[9].length);
		for(int i = 0;i<grid.length;i++) {
			for(int j = 0;j<grid[i].length;j++) {
				output = output + grid[i][j] + "   ";
			}
			output = output + "\n";
		}
		return output + "\n" + save + " occurs the most!";
	}
}