
 /* 9. Write a program to generate ArrayIndexOutOfBoundException
 */


public class ArrayIndexOutOfBound 
{

    public static void main(String[] args) 
    {
        
        String[] arr = {"Atanu", "Ramu", "Laha", "Ram"};
        //ArrayIndexOutOfBoundException because there is no 5th index
        
        try 
        {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException p)
        {
            System.err.println("ArrayIndexOutOfBoundsException caught");

            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            
            p.printStackTrace();
        }
    }
}