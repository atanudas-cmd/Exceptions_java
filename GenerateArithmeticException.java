/*
* 8. Write a program to generate Arithmetic Exception
*/

// ArithmeticException is thrown when an exceptional condition has occurred in an arithmetic operation.
public class GenerateArithmeticException {

   public static void main(String[] args)
   {
      
        int a = 10, b = 0, res1;


       try
       {
           //below code throws divide by zero exception

          res1 = a / b;

           //handles the Arithmetic Exception / Divide by zero exception
       } 
       catch (ArithmeticException e) 
       {
           
        System.err.println("ArithmeticException caught!");
           /* printStackTrace() prints the throwable Exception object as well as with other Information
           like the line number where Exception occurs and class name where the exception occurred.*/
           
           e.printStackTrace();
           
       }
   }
}
