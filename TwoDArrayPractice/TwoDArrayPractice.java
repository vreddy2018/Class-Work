public class TwoDArrayPractice
{
	/**
	* Purpose: This method creates a 4x4 array filled with a count
	* This method works by creating a 4x4 array and then uses 2 For loops to 
	* put a count into the array. 
	* @return array - the array with the count 
	*/
	public static int[][] createArray()
	{
		int [][]array = new int[4][4];
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
		printArray(createArray());
	}


	/**
	* Purpose: This method prints a 2d array
	* This method works by using 2 For loops to 
	* go through the rows and columns and printing each item. 
	*/
	public static void printArray (int [][] array)
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
}