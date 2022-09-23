//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Hoyt

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String winner;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		winner="";
		int x = (int)(Math.random()*3);
		switch (x) {
			case 0:
				compChoice = "R";
				break;
			case 1:
				compChoice = "P";
				break;
			case 2:
				compChoice = "S";
				break;
		}
		if((playChoice.equals("R") && compChoice.equals("S"))||(playChoice.equals("S") && compChoice.equals("P"))||(playChoice.equals("P") && compChoice.equals("R")))
			winner = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Player Wins! <<" + playChoice + " beats " + compChoice + ">>";
		else if((playChoice.equals("S") && compChoice.equals("R"))||(playChoice.equals("P") && compChoice.equals("S"))||(playChoice.equals("R") && compChoice.equals("P")))
			winner = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Computer Wins! <<" + compChoice + " beats " + playChoice + ">>";
		else if(playChoice.equals(compChoice))
			winner = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Its a Tie! <<" + compChoice + " ties " + playChoice + ">>";
		else
			winner = "Error 404: Player entered invalid character";
		return winner;
	}

	public String toString()
	{
		determineWinner();
		return winner;
	}
}
