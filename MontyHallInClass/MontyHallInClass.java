/**
* Monty Hall In Class Simulation
* @author Neil
* @version 1.0
*/



public class MontyHallInClass
{
	public static void main(String[]args)
	{

		int numSim = Integer.parseInt(args[0]); //takes the user's input from the command line
		
		int switchWin = 0;
		for (int i = 0; i < numSim; i++)
		{
			switchWin +=game();
		}
		
		double percentSwitchWin = (double) switchWin/numSim * 100;
		percentSwitchWin = format(percentSwitchWin);
		double percentStayWin = format(100-percentSwitchWin);
		
		System.out.println("% Switch win: " + percentSwitchWin);
		System.out.println("% Stay win: " + percentStayWin);
		
		
		
	}
	
	
	/**
	*This method simulates a monty hall game
	*The function returns 0 if the user guess is correct and they won the car
	*Otherwise the function returns 1
	*The function calculates the guess and the car number by using random ints
	*It determines if the numbers are the same by comparing them
	*@return 0 if guess correct, 
	*@return 1 if switch win
	*/
	public static int game()
	{
		int car = (int) (Math.random() * 3 +1);
		int userChoice = (int) (Math.random() * 3 +1);

		if (userChoice == car)
		{
			return 0;
		}	
		else
		{
			return 1;
		}
		
	}


	/**
	*This method takes in a double and truncates it to 2 decimal places
	*@param - d - the double input to be truncated
	*@return - returnNum - double formatted to 2 decimal places
	*/
	public static double format (double d)
	{
		int extra = (int) (d * 100);
		double returnNum = (double) extra/100;
	
		return returnNum;
	}




}