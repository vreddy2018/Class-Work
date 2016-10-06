public class CountRecursion
{
	
	public static void main(String[] args)
	{
	
		printNum(5);
	
	}
	
	/**
	* This method prints the integers from 0 to n on separate lines using recursion
	* The terminating case is if n is 0.
	* The recursion works by: if n is bigger than 0, the function gets called again with n decremented
	* It keeps returning a decremented n until n is 0. 
	* When n is 0, n is printed, then the function moves back to the previous recursion call and prints the previous number
	* and it goes up the chain until it reaches the original value for n
	* @param - n - the integer that the numbers print up to
	*/
	public static void printNum (int n)
	{
		
		if (n==0)
		{
			System.out.println(n);
		}
		
		else
		{
			
			printNum(n-1);
			System.out.println(n);
		
		}
	
	}



}