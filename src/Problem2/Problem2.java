/*
 * 2.   Write a Java program that does the following:
a.  Create a Java file with the name problem2.java.
b.  Prompt the user for two positive integers, where the difference between the two integers must be at least 10, validating the input until the user enters two positive integers whose difference is at least 10.
c.  Print a random integer from the range of the smaller integer to the larger integer.
Sample run of the program:
Enter two positive integers with a difference of at least 10: -1 15
Invalid input! Try again: 5 9
Invalid input! Try again: 15 39
Random integer between 15 and 39 is 23.
 */

/* package Problem2;
import java.util.Scanner;
public class Problem2 {
   public static void main (String [] args) {
      int x, y;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an integer greater than or equal to 10: ");
      x = input.nextInt();
      y = input.nextInt();
   
   while((Math.abs(x - y) < 10) ) {
      System.out.print("Invalid input! Try again: ");
      x = input.nextInt();
      y = input.nextInt();
   }
   int max,min;

   if (x < y) {
       min = x;
       max = y;
   } else {
       min = y;
       max = x;
   }
   int r = (int)(Math.random()*(max-min + 1) + min);
   System.out.print("Random integer between " + min+ " and " + max +" is "+ r + ".");
    }
   }
*/
 /* * 2.   Write a Java program that does the following:
a.  Create a Java file with the name problem2.java.
b.  Prompt the user for two positive integers, where the difference between the two integers must be at least 10, validating the input until the user enters two positive integers whose difference is at least 10.
c.  Print a random integer from the range of the smaller integer to the larger integer.
Sample run of the program:
Enter two positive integers with a difference of at least 10: -1 15
Invalid input! Try again: 5 9
Invalid input! Try again: 15 39
Random integer between 15 and 39 is 23.
 */
        package Problem2;

import java.util.Scanner;

public class Problem2 {
      public static void main (String [] args) {
           
           Scanner input = new Scanner(System.in);
           int x,y;
           System.out.print("Enter an integer greater than or equal to 10: ");
            x= input.nextInt();
            y= input.nextInt();
            
            while(Math.abs(x-y)<10) {
               System.out.print("Invalid! Enter an integer greater than or equal to 10: ");
               x= input.nextInt();
               y= input.nextInt();
            }
            int max=0, min = 0;
            if (x>y) {
               max=x;
               min = y;
            }
               else if(y>x) {
                  max =y;
                  min= x;
               }
            
           System.out.print((int)(Math.random()*((max-min)+1)+ min));
        }
}










