public class CheckDigit
{
	
	public static void main(String[] args)
	{
	System.out.println(hasDigit("hello"));
	System.out.println(hasDigit("hello1"));
	}
	
	
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
	
	
	
}