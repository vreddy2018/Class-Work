/**
* This is the Farmer's Game
* The game is a puzzle involving a human, sheep, cabbage, and wolf
* The user has to get all the things across a river without any of them being eaten
* Only the human can operate the boat with only one passenger
* The sheep cant be left alone with the cabbage
* The wolf cant be left alone with the sheep
* @author - Neil Reddy
* @version - 1.0
*/

import java.util.Scanner;


public class FarmersGame
{
	// global scope
	// assuming false is bank 0 and true is bank 1
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	
	
	
	public static void main(String[] args)
	{
		
		
		welcome();	
		displayGameStatus();
		while (checkGame() == 1)
		{	

			move();
			displayGameStatus();
		}
	}
	
	
	/**
	* This function prints the welcome messages
	* The messages introduce the game
	* This function has no arguments and returns nothing
	*/
	public static void welcome()
	{
	
		System.out.println("Welcome to the Farmer's Game");
		System.out.println("To win the game you have to get the human, cabbage, wolf, and sheep across the river safely.");
		System.out.println("Only the human can operate the boat, and only one passenger can fit.");
		System.out.println("If the sheep is left alone with the cabbage, the sheep will eat the cabbage.");
		System.out.println("If the wolf is left alone with the sheep, the wolf will eat the sheep.");
		System.out.println("It is up to you to figure out how to get them all across without anything being eaten.");
		
	}
	
	
	/**
	* This function prints the game board
	* It prints the animals represented by the first letter in their name on whatever side of the river they are on
	* This function has no arguments and returns nothing
	*/
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1 = "    ";
		
		if(!cabb)
			bank0 += "C   ";
		else
			bank1 += "C   ";
			
		if(!sheep)
			bank0 += "S   ";
		else
			bank1 += "S   ";
			
		if(!wolf)
			bank0 += "W   ";
		else
			bank1 += "W   ";
			
		if(!human)
			bank0 += "H   ";
		else
			bank1 += "H   ";	
			
		System.out.println(bank0);
		System.out.println("--------------------");
		System.out.println("\n\n\n");
		System.out.println("--------------------");
		System.out.println(bank1);
		
	
	}
	
	
	
	/**
	* This function checks to see if the user has won or lost
	* It checks to see if certain things were left alone without the human
	* It also checks to see if everything made it across the river
	* This function has no arguments
	* @return - 0 if the game is over because either everything crossed or the user lost
	* @return - 1 if the user has not lost and the game is still ongoing
	*/
	public static int checkGame()
	{
		if (cabb == sheep && !(human == cabb) && !(cabb ==wolf))
		{
			System.out.println("You lose! Sheep at the cabbage");	
			return 0;
		} 
		
		else if (wolf == sheep && !(human == wolf) && !(cabb ==wolf))
		{
			System.out.println("You lose! Wolf ate the sheep." );
			return 0;	
		} 
		
		else if (wolf == sheep && human == sheep && sheep == cabb && human == true)
		{
			System.out.println("You WIN!!!");
			return 0;
		}
		
		else
			return 1;
			
	}
	
	
	
	/**
	* This function gets the input from the user for the character the person wants to move
	* The function checks to make sure the human is on the same side as the character
	* The function has no arguments and does not return anything
	*
	*/
	public static void move()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Who would you like to move across. Enter just the first letter in upper case: ");
		String input = kb.nextLine();
		
		if ((!input.equals("S"))&&(!input.equals("C"))&&(!input.equals("W"))&&(!input.equals("H")))
		{
			System.out.println("Invalid Input. ");
			move();
		}
		
		if (input.equals("C")) 
		{
			if (human == cabb) //makes sure that human and cabbage are on the same side
			{
				cabb = !cabb;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible. The human is the only one who can operate the boat.");
			}
			
		}		
		
		
		if (input.equals("S")) 
		{
			if (human == sheep) //makes sure that human and sheep are on the same side
			{
				sheep = !sheep;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible");
			}
			
		}
		
		
		if (input.equals("W")) 
		{
			if (human == wolf) //makes sure that human and cabbage are on the same side
			{
				wolf = !wolf;
				human = !human;
			}
			
			else
			{
				System.out.println("Move not possible");
			}
			
		}
		
		
		
		if (input.equals("H"))
		{
			human = !human;
			
		}		
		
	
			
	}
	
	
}