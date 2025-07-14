package Java.Algorithm;

import java.io.*;

public class BOJ2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        long[] dp = new long[num+1];

        dp[1] = 1;
        if (num > 1){ 
            dp[2] = 1;
        }
        for(int i = 3; i <= num; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[num]);
    }
    
}
