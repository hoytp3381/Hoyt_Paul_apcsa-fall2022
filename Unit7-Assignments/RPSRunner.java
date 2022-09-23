//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Paul Hoyt

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String player = "";
		String again = "y";
		while (again.equals("y")) {
		
			out.println("type in your prompt [R,P,S] :: ");
			player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			out.println(game);
			
			out.println("GAME OVER \n Play Again? (type y for yes)");
			again = keyboard.next();
		}
	}
}
