/*Sam's house has an apple tree and an orange tree that
yield an abundance of fruit. Sam’s two children, Larry and Rob,
decide to play a game in which they each climb a tree and throw fruit
at their (Sam’s) house. Each fruit that lands on the house scores one
point for the one who threw it. Larry climbs the tree on the left
(the apple), and Rob climbs the one on the right (the orange).


For simplicity, we’ll assume all of the landmarks are on a
number line. Larry climbs the apple tree at point , and Rob climbs the
orange tree at point . Sam’s house stands between points  and . Values
increase from left to right.

You will be given a list of distances the fruits are thrown.
Negative distances indicate travel left and positive distances,
 travel right. Your task will be to calculate the scores for Larry and
  Rob and report them each on a separate line.
  for more info https://www.hackerrank.com/challenges/apple-and-orange/problem
* */

import java.util.Scanner;

public class AppleAndOranges {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();


        int apples = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                apples++;
            }
        }
        System.out.println(apples);


        int oranges = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                oranges++;
            }
        }
        System.out.println(oranges);

        scan.close();
    }
}

