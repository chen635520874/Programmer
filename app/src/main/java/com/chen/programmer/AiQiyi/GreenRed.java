package com.chen.programmer.AiQiyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/12/19.
 */

    public class GreenRed {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int len = input.length();
            int[][] dp = new int[2][len+1];
            dp[0][0] = input.charAt(0) == 'R' ? 0 : 1;
            dp[1][0] = input.charAt(0) == 'R' ? 0 : 1;
            for (int i = 1; i < len; ++i) {
                dp[0][i] = dp[0][i - 1] + (input.charAt(i) == 'R' ? 0 : 1);
                dp[1][i] = Math.min(dp[1][i - 1], dp[0][i - 1]) + (input.charAt(i) == 'R' ? 1 : 0);
            }
//如果你想详细看dp的情况可以把下面的注释去掉
        for (int[] ints : dp) {
          for (int anInt : ints) {
               System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        //

            System.out.println(Math.min(dp[0][len - 1], dp[1][len - 1]));
        }
    }



