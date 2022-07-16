/*15. Write a program to generate NullPointerException
 */

 


class NullPointerEx
{
	public static void main (String[] args)
	{
		// Initializing String variable with null value
		String ptr = null;

		// Checking if ptr is null using try catch.
		try
		{
			if ("atanu".equals(ptr))
				System.out.print("it is Same");
			else
				System.out.print("it is Not Same");		
		}
		catch(NullPointerException e)
		{
			System.out.print("Caught NullPointerException");
		}
	}
}
