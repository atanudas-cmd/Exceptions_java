/*
 * 11.Write a program to generate FileNotFoundException
 */


import java.io.*;


public class FileNotFoundEx {
    public static void main(String[] args) {

        try {
          
            BufferedReader reader = new BufferedReader(new FileReader(new File("D:/Tution_java.txt")));
        }
        
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
           
            e.printStackTrace();
        }
    }
}
