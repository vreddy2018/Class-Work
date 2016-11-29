public class TwoDArrayPractice
{
	public static int[][] createArray()
	{
		int [][]array = new int[4][4];
		int count = 1;
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				array[i][j] = count;
				count ++;
			}
		}
	
		return array;
	}

	public static void main (String[] args)
	{
		printArray(createArray());
	}

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