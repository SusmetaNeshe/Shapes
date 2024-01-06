/*
 * 1.   Write a Java program that does the following:
a.  Create a Java file with the name problem1.java.
b.  Prompt the user for a positive integer greater than or equal to 10, validating the input until the user enters a positive integer greater than or equal to 10.
c.  Print a random integer between 1 and the user's integer. Use Math.random() method, which returns a random double value between [0, 1), i.e., 0 inclusive, 1 not inclusive.
Sample run of the program:
Enter an integer greater than or equal to 10: 7
Invalid input! Try again: 11
Random integer between 1 and 11 is 9.

 */
/*package Problem1;
import java.util.Scanner;
import java.util.Random;
public class Problem1 {
   public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an integer greater than or equal to 10: ");
      int x = input.nextInt();
      while(x <10 ) {
         System.out.print("Invalid input! Try again: ");
         x= input.nextInt();
      }
      int r = (int)(Math.random()*x +1);
      System.out.print("Random integer between 1 and 11 is "+ r + ".");      
}
}*/
   package Problem1;

   import java.util.Scanner;

public class Problem1 {
      public static void main (String[] args) {
         
         Scanner input = new Scanner (System.in);
         System.out.print("Enter a positive integer greater than or equal to 10: ");
         int x = input.nextInt();
         while(x<10) {
            System.out.print("Invalid try again: ");
            x= input.nextInt();
         }
        int r = (int)(Math.random()*x+1);
        System.out.print(r);
        
      }
   
}





