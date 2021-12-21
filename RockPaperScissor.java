//Andrea Soteldo
//COSC-1430.501 (wed)
//Project1
//14Oct2020
//This program should allow you to play Rock, Paper, Scissor with a second player. Enjoy!
package src;
import java.util.Scanner;
public class RockPaperScissor 
{
	public static void main(String[] args)
	{
		String player1, player2;
		System.out.println("Time for Rock, Paper, Scissor... choose wisely.");
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Go ahead player1: ");
		player1 = keyboard.next();
		System.out.println("Your turn player2: ");
		player2 = keyboard.next();
		keyboard.close();
	
		if (player1.equalsIgnoreCase(player2))
			System.out.println("Tie.");
		else if (player1.equalsIgnoreCase("r") && (player2.equalsIgnoreCase("p")))
			System.out.println("Paper beats Rock. Congratulations player2!");
		else if (player1.equalsIgnoreCase("r") && (player2.equalsIgnoreCase("s")))
			System.out.println("Rock beats Scissor. Congratulations player1!");
		else if (player1.equalsIgnoreCase("p") && (player2.equalsIgnoreCase("r")))
			System.out.println("Paper beats Rock. Congratulations player1!");
		else if (player1.equalsIgnoreCase("p") && (player2.equalsIgnoreCase("s")))
			System.out.println("Scissor beats Paper. Congratulations player2!");
		else if (player1.equalsIgnoreCase("s") && (player2.equalsIgnoreCase("p"))) 
			System.out.println("Scissor beats Paper. Congratulations player1!");
		else if (player1.equalsIgnoreCase("s") && (player2.equalsIgnoreCase("r")))
			System.out.println("Rock beats Scissor. Congratulations player2!");
		else 
			System.out.println("Not fair game. Try again.");
	}
}
