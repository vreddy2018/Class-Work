/**
* TicTacToe
* This is the game Tic Tac Toe
* @author Neil
* @version 1.0
*/

import java.util.Scanner;

public class TicTacToeWorking
{
	public static void main(String[] args)
	{
		boolean player = true;
		String[][]board = initBoard(3);
		printArray(board);
		int countMoves = 0;
		
		while (checkRow(board) == false && checkCol(board) == false && checkDiagonal(board) == false && countMoves<board.length*board.length && checkOppDiagonal(board) == false)
		{
			playMove(getMove(), board, player);
			printArray(board);
			player = !player;
			countMoves++;
		}
		System.out.println("Game Over");
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
				System.out.print("|"+ array[row][col]);
			}
			System.out.print("|");
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
	
	
	/**
	* Purpose: This method takes in the user's choice and places the move on the board
	* This method works by finding the user's choice and replacing it with their tile
	* @param String userChoice - the user's move
	* @param String [][] board - the game board
	* @param boolean Player  - the player who's turn it is
	*/
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
	
	
	/**
	* Purpose: This method checks each row to see if someone has one
	* It works by comparing the tile in the first column of the row to the tile in the next column
	* to see if they are the same and compares til the end of the row if they are the same.
	* If everything is the same true is returned, if there is a difference false is returned.
	* @param String [] [] board - the game board
	* @return boolean true - if the game is over
	* @return boolean false - if there is no winner yet
	*/
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
	
	
	/**
	* Purpose: This method checks each column to see if someone has one
	* It works by comparing the tile in the first row of the column to the tile in the next row
	* to see if they are the same and compares til the end of the column if they are the same.
	* If everything is the same true is returned, if there is a difference false is returned.
	* @param String [] [] board - the game board
	* @return boolean true - if the game is over
	* @return boolean false - if there is no winner yet
	*/
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
	
	/**
	* Purpose: This method checks to see if someone has one by the diagonal from top left
	* to bottom right. The first diagonal is [0,0] and the next is [1,1] etc., so the method
	* keeps checking the positions at the same [row][column] value.
	* If everything is the same true is returned, if there is a difference false is returned.
	* @param String [] [] board - the game board
	* @return boolean true - if the game is over
	* @return boolean false - if there is no winner yet
	*/
	public static boolean checkDiagonal (String[][] board)
	{
		for (int row = 0; row < board.length - 1; row++)
		{	for (int column = 0; column < board[row].length; column++)
			{	
				if (row == column) //we are on a diagonal
				{
					if(!(board[row][column].compareTo(board[row + 1][column + 1]) == 0))
						return false;
	
				}
			}
		}
	
		return true;
	}
	
	public static boolean checkOppDiagonal (String[][] board)
	{
		boolean diag = false;
		int row = board.length-1;
		int col = 0;
		while (col<board.length-1)
		{
			if (board[row][col].compareTo(board[row-1][col+1])==0)
			{
				col++;
				row--;
			}
			else
				return false;
		}
		return true;
	}
}