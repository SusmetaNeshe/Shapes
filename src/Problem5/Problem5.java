/*
 * 5.   Write a Java program that does the following:
a.  Create a Java file with the name problem5.java.
b.  Simulate repeated coin tosses with a penny.
c.  Simulate each penny toss by randomly generating a 0 or 1, with 0 representing heads and 1 representing tails.
d.  Keep a count of the numbers of 0's and 1's generated per set of simulations.
e.  Divide the resulting counts by the total number of simulated tosses to compute the relative frequency of each possible result.
f.  Perform the above simulation for each of the following total number of simulated tosses:
10, 100, 1000, and 10000.
Sample run of the program:
Probability of heads given 10 tosses = 0.6
Probability of tails given 10 tosses = 0.4
Probability of heads given 100 tosses = 0.53
Probability of tails given 100 tosses = 0.47
Probability of heads given 1000 tosses = 0.484
Probability of tails given 1000 tosses = 0.516
Probability of heads given 10000 tosses = 0.4974
Probability of tails given 10000 tosses = 0.5026
 */
/*package Problem5;
import java.util.Random;
public class Problem5 {
      public static void main(String[] args) {
          int t = 10;
          while (t <= 10000) {
              int headsCount = 0;
              for (int i = 0; i < t; i++) {
                  int Result = (int) (Math.random() * 2); 
                  if (Result == 0) {
                      headsCount++;
                  }
              }
              double hProbability = (double) headsCount / t;
              double tProbability = 1 - hProbability;
              System.out.println("Probability of heads given " + t + " tosses = " + hProbability);
              System.out.println("Probability of tails given " + t + " tosses = " + tProbability);
              t *= 10;
          }
      }
  }


*/

/*
 * 5.   Write a Java program that does the following:
a.  Create a Java file with the name problem5.java.
b.  Simulate repeated coin tosses with a penny.
c.  Simulate each penny toss by randomly generating a 0 or 1, with 0 representing heads and 1 representing tails.
d.  Keep a count of the numbers of 0's and 1's generated per set of simulations.
e.  Divide the resulting counts by the total number of simulated tosses to compute the relative frequency of each possible result.
f.  Perform the above simulation for each of the following total number of simulated tosses:
10, 100, 1000, and 10000.
Sample run of the program:
Probability of heads given 10 tosses = 0.6
Probability of tails given 10 tosses = 0.4
Probability of heads given 100 tosses = 0.53
Probability of tails given 100 tosses = 0.47
Probability of heads given 1000 tosses = 0.484
Probability of tails given 1000 tosses = 0.516
Probability of heads given 10000 tosses = 0.4974
Probability of tails given 10000 tosses = 0.5026
 */
package Problem5;
import java.util.Random;

public class Problem5 {
   public static void main(String[] args) {
       int t = 10;
       while (t <= 10000) {
           int headsCount = 0;
           for (int i = 0; i < t; i++) {
               int Result = (int) (Math.random() * 2); 
               if (Result == 0) {
                   headsCount++;
               }
           }
           double hProbability = (double) headsCount / t;
           double tProbability = 1 - hProbability;
           System.out.println("Probability of heads given " + t + " tosses = " + hProbability);
           System.out.println("Probability of tails given " + t + " tosses = " + tProbability);
           t *= 10;
       }
   }
}
