/*
* 7.Write a program with finally block
*/


public class FinallyBlock {

   public static void main(String args[]) {
       try {
           //below code throws divide by zero exception
           int data1 = 10 / 0;
           System.out.println(data1);
       }
       //handles the Arithmetic Exception / Divide by zero exception
       catch (ArithmeticException e) {
           System.out.println("Exception handledeling");
           e.printStackTrace();
       }
       //finally block executes regardless of exception occurred or not
       finally {
           System.out.println("finally block is always executed");
       }
       System.out.println("Main method ended here ");
   }
}