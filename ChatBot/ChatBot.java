import java.util.Scanner;
/**
* Chatbot
* This program will ask about the user's basic information, and then keeps
* on asking if there is anything the user wants to talk about until the user says 'bye' or 'Bye'
* @author Neil
* @version 1.0
*/

public class ChatBot
{
  /**
	*This is the main method that the java interprets
	*@param args This is a command line argument
	*/
	public static void main(String[] args)
	{
		// create a new scanner object
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = kb.nextLine();
		System.out.print("Hello " + name + "! How are you? ");
		String input = kb.nextLine();
		System.out.println("You are " + input);
		System.out.print("How old are you? ");
		double age =  kb.nextDouble();
		
		if(age>30)
		{
			System.out.println(name + " you are old.");
		}
		
		else
		{
			System.out.println("Yay");
		}
		
		System.out.print("How tall are you? ");
		double height = kb.nextDouble();
		
		if(height > 6.0)
		{
			System.out.println("You're tall");
		}
		else if (height > 5.0)
		{
			System.out.println("You're medium");
		}
		else
		{
			System.out.println("You're short");
		}
		
		kb.nextLine(); //will get rid of the newLine char from the previous input from users
		System.out.println("What is your favorite color? ");
		String colour = kb.nextLine();
		System.out.println("Your favorite color is " + colour);
		
		
		while (!input.equals("bye") && !input.equals("Bye")) //.equals because the input text is stored at the location input
		{
			System.out.println(name + ", What else do you want to talk about?");
			input = kb.nextLine();

		
		}
	}
	







}