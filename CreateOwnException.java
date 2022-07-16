/* 6. Write a program to create your own exception
*/


//custom exception class always extends directly from the Exception class
class InvalidExamException extends Exception 
{
   InvalidExamException(String msg) 
   {
       System.out.println(msg);
   }
}

//creating our own exception
public class CreateOwnException 

{

   //creating a method which receives integer as parameter
   static void exam(int marks) throws InvalidExamException
    {
       // throws exception if marks are less than 40
       if (marks < 50) 
       {
           //InvalidExamException is our own custom exception
           throw new InvalidExamException("He is Failed in exam");
       } else 
       {
           System.out.println("He is Passed in exam");
       }
   }

   public static void main(String[] args) 
   {
       try 
       {
           
           exam(30);
       } catch (Exception e) 
       {
           /* printStackTrace() prints the throwable Exception object as well as with other Information
           like the line number where Exception occurs and class name where the exception occurred.*/
           e.printStackTrace();
       }
   }
}
