/*Write a program to generate NumberFormatException */

import java.util.Scanner;


public class NumberFormatExceptionEx
{
        
        static void numberConversion(String input)
        {
                try
                {
                    int number = Integer.parseInt(input);
                    System.out.println("The input integer after conversion is : "+number);
                }
                catch(java.lang.NumberFormatException e)
                {
                    System.out.println("Error!!! While converting input to integer");
                }
            }
            
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Enter the string to be converted to an integer : ");
                    String input = scanner.nextLine();
                    numberConversion(input);
                }
            }
}
