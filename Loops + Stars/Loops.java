/**
* Loops
* This program has a bunch of example loop functions
* At the bottom of this document are the star functions
* @author Neil
* @version 1.0
*/


/**
* Loops
* This program has different uses of loops and includes 2 functions that make a staircase of stars, both increasing and decreasing
* @author Neil
* @version 1.0
*/


public class Loops
{
  /**
	*This is the main method that the java interprets
	*@param args This is a command line argument
	*/
	public static void main(String[] args)
		{
		whileLoop(); // calls while loop
		
		System.out.println();
		
		forLoop(); // calls for loop
		
		System.out.println();
		nestedWhileLoop(5);
		
		System.out.println();
		nestedForLoop(5);
		
		System.out.println();
		staircaseIncreasing(5);
		
		System.out.println();
		staircaseDecreasing(5);
		}
	
	public static void whileLoop()
		{
		int count = 1;
		while (count <= 10)
			{
			System.out.println(count);
			count ++; // increments counter
			}
		
		}
	
	
	public static void forLoop()
		{
		for (int i = 1; i< 11; i+=2)
			{
			System.out.println(i);
			}

		}
	
	
	public static void nestedWhileLoop(int n)
		{

		int row = 0;
		while (row < n)
			{
			int column = 0;
			while (column < n)
				{
				System.out.print('*');
				column ++;
				}
			System.out.println();
			
			row ++;
				
				
			}
	
		}
	
	
	public static void nestedForLoop(int n)
		{
		for (int row = 0;row<n;row++)
			{
			for (int col = 0;col<n;col++)
				{
				System.out.print('*');
				}
			System.out.println();
			}
	
	
		}
	
	
	
	
	
	
	
	
	
	/**
	*@param - int n - the number of stars the program prints up to
	*This function makes a staircase of stairs that starts with one star and increases to whatever integer n is
	*This function uses a nested while loop
	*/
	public static void staircaseIncreasing(int n)
	
		{
		int stars = 1;
		while (stars <= n)
			{
			
			int count = 0;
			while (count<stars)
				{
				System.out.print('*');
				count ++;
				}

			System.out.println();
			stars ++;
			}
		}
	
	/**
	*@param - int n - the number of stars the program starts printing
	*This function makes a staircase of stairs that starts with n number of stars and decreases down to one star
	*This function uses a for loop nested in a while loop
	*/
	public static void staircaseDecreasing(int n)
		{
		int count = 1;
		
		while (count <= n)
			{
			for (int star = 0; star<n; star++)
				{
				System.out.print('*');
				}
			System.out.println();
			n--;
			}
		
		}
		
	
	/**
	*@param - int n - the number of stars the program starts printing
	*This function makes a staircase of stairs that starts with n number of stars and decreases down to one star
	*This function uses a for loop nested in a while loop
	*This is the version that we made in class without decrementing n
	*/
	public static void staircaseDecreasing2(int n) // in class way to do it...Not supposed to change n
		{
		for (int row = 0; row<n;row++)
			{
			for (int col = 0; row + col <n; col++) //or for (int col = n-row; col>0; col--)                                                                                                                                                                                                                                                                                  
				
				{
				System.out.print('*');
				}
			System.out.println();
			}
		
		}
}