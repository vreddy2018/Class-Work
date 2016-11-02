public class StringMethods 

{

	public static void main(String[] args)
	{
		System.out.println("Find String Examples");
		System.out.println(findString("racecar","car",0));
		System.out.println(findString("abcabcdabc","abc",2));
		System.out.println(findString("abcd","ef",1));
		System.out.println("Count String Examples");
		System.out.println(countStrings("racecar","car"));
		System.out.println(countStrings("abcabcdabc","abc"));
		System.out.println(countStrings("abcabcabc","abc"));
		System.out.println("Italics Examples");
		System.out.println(convertItalics("hello_ goodbye_"));
		System.out.println(convertItalics("hello goodbye_"));
		System.out.println(convertItalics("This is _very_ good."));
		System.out.println(convertItalics("_This_ is _very_ _good_."));
		System.out.println(convertItalics("This is _very good." ));
		System.out.println(convertItalics("This is __very good."));
		System.out.println(convertItalics("This is ____very good."));
		System.out.println(convertItalics("This is ____very good.__"));
	}
	
/**
 * Finds the first instance of s in line,
 * starting at the position start
 * @param o the orignal string 
 * @param s the string to find 
 * @param start the position to start searching.
 * Guaranteed to be in the string line. (precondition)
 * @return the index of the first single instance of
 * s if the string is found OR -1 if it is not found.
 */
	public static int findString (String o, String s, int start)
	{
		String section = o.substring(start);
		int location = section.indexOf(s);
		if (location>-1)
			return (location+start);
		else
			return location;
	}
	
	
	
	/**
 	* Count the number of times instances of s appear in
 	* the line.
 	* @param o the original string
 	* @param s the string to find.
 	* @return the number of times the string appears in the line
 	*/
	public static int countStrings (String o, String s)
	{
		
		int count = 0;
		int times = 0;
		int originalLength = o.length()-1;
		
		while (count < originalLength)
		{
			String ToCheck = o.substring(count);
			if (ToCheck.indexOf(s)>-1)
			{
				times ++;
				int location = (ToCheck.indexOf(s));
				count = count + location+1;
			}
			else
			{
				count++;
			}
		}
		return times;
	}
	
	/**
	* Replace all instances of underscores in the line given by
	* line with italics tags.  There must be an even number of underscores
	* in the line, and they will be replaced by <I>, </I>, alternating.
 	* @param line a string with 0 or more underscores
 	* @return the line that has underscores replaced with <I> </I> tags or 
 	* the original line if there are not an even number of underscores.
 	*/
 	public static String convertItalics (String line)
 	{
 		if (((countStrings(line, "_")%2)==0))
 		{
 			int italicsCount = 0;
 			for(int character = 0; character<line.length();character++)
 			{
 				
 				if (line.charAt(character) == '_') //line.charAt(character+1) != '_' 
 				{
 					
 					if ((italicsCount%2) == 0)
 					{
 						
 						line = line.substring(0,character) + "<I>" + line.substring(character+1);
 						character = 0;
 						
 					}
 					
 					else
 					{
 						line = line.substring(0,character) + "</I>" + line.substring(character+1);
 						character = 0;
 					}
 					italicsCount ++;
 					
 				}
 			
 			
 			 }
 	
 		
 		}
 		else
 		{
 			return line;
 		
 		}
 		
 		int repeat = countStrings (line, "<I></I>");
 		if (repeat >0)
 		{
 			for (int i = 0; i<repeat; i++)
 			{
				int start = findString(line, "<I></I>", 0);
				if (start >0)
				{
					line = line.substring(0,start) + "__" + line.substring(start+7);
				}
			}
 		}
 		
 		return line;
 		
 	
 	}
	
	
}