/**
* Check Digits
* @author Neil
* This program has methods that check to see if a word is a palindrome
*/
public class CheckDigit
{
	
	public static void main(String[] args)
	{
	System.out.println("Has digit examples");
	System.out.println(hasDigit("hello"));
	System.out.println(hasDigit("hello1"));
	System.out.println();
	
	System.out.println("Recursive Is Palindrome with charAt examples");
	System.out.println(isPalindrome("racecar"));
	System.out.println(isPalindrome(""));
	System.out.println(isPalindrome(" "));
	System.out.println(isPalindrome("no"));
	System.out.println();
	
	System.out.println("Recursive Is Palindrome without charAt examples");
	System.out.println(isPalindrome1("racecar"));
	System.out.println(isPalindrome1(""));
	System.out.println(isPalindrome1(" "));
	System.out.println(isPalindrome1("no"));
	System.out.println();
	
	System.out.println("Iterative is palindrome with charAt examples");
	System.out.println(isPalindrome2("racecar"));
	System.out.println(isPalindrome2(""));
	System.out.println(isPalindrome2(" "));
	System.out.println(isPalindrome2("no"));
	System.out.println();
	
	System.out.println("Iterative is palindrome without charAt examples");
	System.out.println(isPalindrome3("racecar"));
	System.out.println(isPalindrome3(""));
	System.out.println(isPalindrome3(" "));
	System.out.println(isPalindrome3("no"));
	System.out.println();
	}
	
	/**
	* This methods takes in a String and returns true if it has
	* a digit. It uses ASCII numbers to check whether the given
	* String has a digit.
	* @param s The String to check whether it has a digit
	* @return boolean true if the String has a digit, false otherwise
	*/
	public static boolean hasDigit(String s)
	{ //typecast into ascii and check if it is in the ascii range
		boolean found = false;

		for(int i=0;i<s.length();i++)
		{
			int character = (int) s.charAt(i);

			
			if (character >= 48 && character <= 57)
			{
				found = true;
			}
		}
		
		return found;
	}
	
	
	
	/**
	*This method takes in a String and returns true if the given string is a palindrome.
	*This method does so recursively using charAt
	*@param s - the String to check whether it is a palindrome
	*@return boolean true - if palindrome, false otherwise
	*/
	public static boolean isPalindrome(String s) //recursive with charAt
	{
		if (s.length()>=2)
		{
			char first = s.charAt(0);
			char last = s.charAt(s.length()-1);
			if (first==last)
			{
				return isPalindrome(s.substring(1, s.length()-1));
			}
			else
			{
				return false;
			}
		}	
		else
		{
			return true;
		}
	}

	/**
	*This method takes in a String and returns true if the given string is a palindrome.
	*This method does so recursively without using charAt
	*@param s - the String to check whether it is a palindrome
	*@return boolean true - if palindrome, false otherwise
	*/
	public static boolean isPalindrome1(String s) //recursive without charAt
	{
		if (s.length()>=2)
		{
			String first = s.substring(0,1);
			String last = s.substring(s.length()-1);
			
			if (first.equals(last))
			{
				return isPalindrome(s.substring(1, s.length()-1));
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	/**
	*This method takes in a String and returns true if the given string is a palindrome.
	*This method does so iteratively using charAt
	*@param s - the String to check whether it is a palindrome
	*@return boolean true - if palindrome, false otherwise
	*/
	public static boolean isPalindrome2(String s) //iteratively with charAt
	{
		int firstCount = 0;
		int lastCount = s.length()-1;
		
		while (lastCount > firstCount)
		{
			char first = s.charAt(firstCount);
			char last = s.charAt(lastCount);
			
			if (first == last) 
			{
				firstCount ++;
				lastCount --;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	*This method takes in a String and returns true if the given string is a palindrome.
	*This method does so iteratively without using charAt
	*@param s - the String to check whether it is a palindrome
	*@return boolean true - if palindrome, false otherwise
	*/
	public static boolean isPalindrome3(String s) //iteratively without charAt
	{
		int firstCount = 0;
		int lastCount = s.length()-1;
		
		while (lastCount > firstCount)
		{

			String first = s.substring(firstCount,(firstCount+1));
			String last = s.substring(lastCount, lastCount+1);

			if (first.equals(last))
			{
				firstCount ++;
				lastCount --;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}