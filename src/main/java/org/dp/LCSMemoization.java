package org.dp;
import java.util.Arrays;

public class LCSMemoization {

    int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        memo = new int[m + 1][n + 1];

        // Fill with -1
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return lcs(text1, text2, m, n);
    }

    public int lcs(String text1, String text2, int m, int n) {

        // Base Case
        if (m == 0 || n == 0)
            return 0;

        // Already calculated
        if (memo[m][n] != -1)
            return memo[m][n];

        // Characters match
        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
            memo[m][n] = 1 + lcs(text1, text2, m - 1, n - 1);
        }
        // Characters don't match
        else {
            memo[m][n] = Math.max(
                    lcs(text1, text2, m - 1, n),
                    lcs(text1, text2, m, n - 1));
        }

        return memo[m][n];
    }

    public static void main(String[] args) {

        LCSMemoization obj = new LCSMemoization();

        String text1 = "abcde";
        String text2 = "ace";

        System.out.println(obj.longestCommonSubsequence(text1, text2));
    }
}