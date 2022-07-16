/* 14.Write a program to generate NoSuchMethodException
*/


import java.lang.reflect.Method;

class NoSuchMethodEx{
  
   public void addition(int a, int b) {
       int c;
       c = a + b;
       System.out.println(c);
   }
}

public class NoSuchMethod {
   public static void main(String[] args) {

       try {
           Abc c = Abc.forName("D:/Tution_java.txt");
         
           Method m = c.getDeclaredMethod("subtraction",int.class, int.class);
       }
     
       catch (NoSuchMethodException | ClassNotFoundException e) {
         
           e.printStackTrace();
       }
       
   }
}
