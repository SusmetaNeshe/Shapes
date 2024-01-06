/*
 * 4.   Write a Java program that does the following:
a.  Create a Java file with the name problem4.java.
b.  Randomly generate an integer n from the range 1 to 100.
c.  Prompt the user to guess the integer.
d.  After each guess, the program gives a hint:
•   If the guess is larger than n, then the program prints Too big.
•   If the guess is smaller than n, then the program prints Too small.
e.  If the user didn’t guess the integer n, then prompt the user to guess again.
f.  The program keeps track of the number of guesses.
g.  When the user's guess is correct, then print Congratulations! You took g guesses. where g is the number of guesses.
Sample run of the program:
Guess the integer I'm picked from the range 1 to 100:
50
Too big.
40
Too small.
45
Too big.
43
Too small.
44
Congratulations! You took 5 guesses.
 */

package Problem4;

import java.util.Scanner;

/*import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = (int) (Math.random() * 100) + 1;
        int guessCount = 1;
        
        System.out.print("Guess the integer I'm picked from the range 1 to 100: ");
        int n= input.nextInt();
        
        while (! (n== r)) {
           if(n>r) {
           System.out.print("Too big.");
        }
           else if(n<r) {
           System.out.print("Too small.");
           
        }
        n= input.nextInt();
        guessCount++;
        }
           System.out.print("Congratulations! You took " + guessCount+ " guesses.");
        }
}*/
    /*
     * 4.   Write a Java program that does the following:
    a.  Create a Java file with the name problem4.java.
    b.  Randomly generate an integer n from the range 1 to 100.
    c.  Prompt the user to guess the integer.
    d.  After each guess, the program gives a hint:
    •   If the guess is larger than n, then the program prints Too big.
    •   If the guess is smaller than n, then the program prints Too small.
    e.  If the user didn’t guess the integer n, then prompt the user to guess again.
    f.  The program keeps track of the number of guesses.
    g.  When the user's guess is correct, then print Congratulations! You took g guesses. where g is the number of guesses.
    Sample run of the program:
    Guess the integer I'm picked from the range 1 to 100:
    50
    Too big.
    40
    Too small.
    45
    Too big.
    43
    Too small.
    44
    Congratulations! You took 5 guesses.
     */


public class Problem4 {
    public static void main(String[] args) {
        int count = 1; // Initialize count to 1 since the user's first guess counts as an attempt
        Scanner input = new Scanner(System.in);
        int r = (int) (Math.random() * 100) + 1;
        System.out.println("Guess the integer I've picked from the range 1 to 100:");

        int x = input.nextInt();
        while (r != x) {
            if (x < r) {
                System.out.println("Too small.");
            } else {
                System.out.println("Too big.");
            }
            x = input.nextInt();
            count++;
        }

        System.out.println("Congratulations! You took " + count + " guesses.");
        input.close(); // Close the scanner to prevent resource leaks
    }
}




