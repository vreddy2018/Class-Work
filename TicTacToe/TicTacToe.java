/**
* TicTacToe
* This is the game Tic Tac Toe
* @author Neil
* @version 1.0
*/

import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{
		boolean player = true;
		String[][]board = initBoard(3);
		printArray(board);
		
		while (checkRow(board) == false && checkCol(board) == false)
		{
			playMove(getMove(), board, player);
			printArray(board);
			player = !player;
		}
	}
	
	/**
	* Purpose: This method initializes the board as a 2d array
	* The array is populated with a count that is converted into string.
	* @param int size - the dimensions of board
	* @return String [][] board - the game board
	*/
	public static String[][] initBoard(int size)
	{
		String [][]board = new String[size][size];
		int count = 1;
		for (int row=0;row<board.length;row++)
		{
			for (int col=0;col<board[row].length;col++)
			{
				board[row][col] = Integer.toString(count);
				count ++;
			}
		}
		return board;
	
	}
	
	
	/**
	* Purpose: This method prints the board in a readable format
	* @param String [][]array - the board to be printed
	*/
	public static void printArray (String [][] array)
	{
		for (int row = 0; row<array.length;row++)
		{
			for (int col = 0; col<array[row].length; col++)
			{
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	* Purpose: This method gets the users input for where they want to go
	* The user's input is a string of a number
	* @return String input - the user's choice
	*/	
	public static String getMove()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Where would you like to play? : ");
		String input = kb.nextLine();
		return input;
	}
	
	public static void playMove(String userChoice, String[][]board, boolean player)
	{
		for (int row = 0; row<board.length;row++)
		{
			for (int col = 0; col<board[row].length; col++)
			{	
				if(board[row][col].compareTo(userChoice)==0)
				{
					if (player == true)
					{
						board[row][col] = "x";
					}
					else
					{
						board[row][col] = "o";
					}
				}
			}
		}
	}
	
	public static boolean checkRow(String[][] board)
	{
		boolean rowWin = false;
		int colCount = 0;
		
		for (int row = 0; row<board.length;row++)
		{
			for (int col = 0; col<board[row].length-1; col++)
			{	
				if(board[row][col].compareTo(board[row][col+1])==0)
				{
					rowWin = true; //so far it is true
					colCount++;
				}
				else
					colCount = 0;
			}
			if (rowWin == true && colCount+1 >= board.length)
			{
				return true;
			}
		}
		return false;
	}	
	
	public static boolean checkCol(String[][] board)
	{
		boolean colWin = false;
		for (int row = 0; row<board.length-1;row++)
		{
			for (int col = 0; col<board[row].length; col++)
			{	
				if(board[row][col].compareTo(board[row+1][col])==0)
				{
					colWin = true; //so far it is true
					row++;
					col--;
				}
				if (colWin == true && row+1 >= board.length)
				{
					return true;
				}
			}
		}
		return false;
	}
	
}