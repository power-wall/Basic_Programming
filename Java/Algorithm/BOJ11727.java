package Java.Algorithm;

import java.io.*;

public class BOJ11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        if (num == 1 || num == 2) {
            System.out.println(1);
            return;
        }

        int[] dp = new int[num+1];
        dp[1] = 1;
        dp[2] = 3;

        for(int i = 3; i <= num; i++){
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }

        System.out.println(dp[num]);
    }
}
