/* *
 * 1. Write a program to generate Arithmetic Exception without exception handling
 * 2. Handle the Arithmetic exception using try-catch block
 */


// ArithmeticException is thrown when an exceptional condition has occurred in an arithmetic operation.
public class ArithmeticExceptionTryCatch 
{

    public static void main(String[] args) {
        int num1 = 12, num2 = 0, result;
        try {
            System.out.println("\nInside try block\n");
            //below code throws divide by zero exception
            result = num1 /num2;
            System.out.println("Results is=\n " + result);
        }
        //2. handles the Arithmetic Exception
        catch (java.lang.ArithmeticException e) {
            System.out.println("\nHandling the Arithmetic exception using try-catch block\n");
        }

        //1. generating Arithmetic Exception without exception handling
        result =num1 / num2;      

        System.out.println("without exception handling\n");
    }
}