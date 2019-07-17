package CodeWars;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnagramBest {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            int[] M = new int[26];
            char[] A = br.readLine().toCharArray();
            char[] B = br.readLine().toCharArray();

            for (char c : A) {
                M[((int) c) - 97]++;
            }
            for (char c : B) {
                M[((int) c) - 97]--;
            }
            int ans = 0;
            for (int i = 0; i < 26; i++) {
                ans += Math.abs(M[i]);
            }

            System.out.println(ans);


        }
    }
}

