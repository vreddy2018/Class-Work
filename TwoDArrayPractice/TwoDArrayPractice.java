/**
* TwoDArrayPractice
* This is practice making a 2d array
* @author Neil
* @version 1.0
*/

public class TwoDArrayPractice
{
	/**
	* Purpose: This method creates a nxn array filled with a count
	* This method works by creating a nxn array and then uses 2 For loops to 
	* put a count into the array. 
	* @return array - the array with the count 
	* @param n - the dimensions of the grid
	*/
	public static int[][] createArray(int n)
	{
		int [][]array = new int[n][n];
		int count = 1;
		for (int row=0;row<array.length;row++)
		{
			for (int col=0;col<array[row].length;col++)
			{
				array[row][col] = count;
				count ++;
			}
		}
		return array;
	}



	public static void main (String[] args)
	{
		printArray(createArray(3));
		printArray(createArray(5));
	}


	/**
	* Purpose: This method prints a 2d array
	* This method works by using 2 For loops to 
	* go through the rows and columns and printing each item. 
	* The number of dashes is calculated by the length of the array
	* multiplied by 2 because there are lines separating each number
	* plus one because there is a line at the end.
	* If the array length is more than 3 then the array
	* will have double digit numbers, so the array length has to be added again.
	* For printing the number, if the number is double digit, no spaces are printed,
	* but if the number is one digit, and is part of an array that has double digits
	* then a space is printed with the number so that it occupies to spaces.
	*/
	public static void printArray (int [][] array)
	{
		int numDashes = array.length * 2 +1;
		if (array.length >3)
		{
			numDashes = numDashes + array.length;
		}
		
		for (int row = 0; row<array.length;row++)
		{
			printLine(numDashes);
			
			
			for (int col = 0; col<array[row].length; col++)
			{
				System.out.print("|");
				
				if (array[row][col]>9)
				{
					System.out.print(array[row][col]);
				}
				else if (array[row][col]<10&&array.length>3)
				{
					System.out.print(array[row][col]+" ");
				}
				else
				{
					System.out.print(array[row][col]);
				}
			}
			System.out.println("|");
		}
		printLine(numDashes);
	}
	
	/**
	* Purpose: This method prints the dashes for the print function
	*/
	public static void printLine(int n)
	{
		for (int i = 0; i<n;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}