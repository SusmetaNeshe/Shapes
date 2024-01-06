/*
 * 3.   Write a Java program that does the following:
a.  Create a Java file with the name problem3.java.
b.  Prompt the user for a positive integer, which is the number of die rolls simulated, printing Not playing games. and terminating the program if the user enters an invalid integer.
c.  Use a loop to simulate n die rolls, where for each die roll, print the roll number and the simulated die roll value.
d.  After the last die roll, print the total count of ones rolled.
Sample run of the program:
Enter the number of die rolls: 5
Roll 1: 2
Roll 2: 3
Roll 3: 6
Roll 4: 1
Roll 5: 2
Total number of ones rolled: 1.
 */

package Problem3;

import java.util.Scanner;

/*import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
       int count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of die rolls: ");
       int n = input.nextInt();
            if (n < 1) {
                System.exit(0);
            }
                for (int i = 1; i <= n; i++) {
                    int roll = (int) (Math.random() * 6) + 1;
                    System.out.println("Roll " + i + ": " + roll);
                    if (roll == 1) {
                        count++;
                    }
                }
                System.out.println("Total number of ones rolled: " + count + ".");
            }

    }
*/

/*
 * 3.   Write a Java program that does the following:
a.  Create a Java file with the name problem3.java.
b.  Prompt the user for a positive integer, which is the number of die rolls simulated, printing Not playing games. and terminating the program if the user enters an invalid integer.
c.  Use a loop to simulate n die rolls, where for each die roll, print the roll number and the simulated die roll value.
d.  After the last die roll, print the total count of ones rolled.
Sample run of the program:
Enter the number of die rolls: 5
Roll 1: 2
Roll 2: 3
Roll 3: 6
Roll 4: 1
Roll 5: 2
Total number of ones rolled: 1.
 */
          public class Problem3{
             public static void main(String[] args) {
                int count = 0;
                Scanner input = new Scanner (System.in);
                System.out.print("positive integer ");
                int x = input.nextInt();
                if ( x <1) {
                   System.exit(0);
                   
                }
                for (int i = 1; i<=x; i++) {
                   int roll = (int) (Math.random() * 6) + 1;
                   System.out.println("Roll " + i + ": " + roll);
                   if (i==1);
                   count++;
                }
                System.out.print("Total number of ones rolled: " + count);
             }
          }










