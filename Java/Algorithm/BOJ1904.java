package Java.Algorithm;

import java.io.*;

public class BOJ1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[] dp = new int[num+1];
        dp[1] = 1;
        if(num >= 2){
            dp[2] = 2;
        }
        for(int i = 3; i <= num; i++){
            dp[i] = (dp[i-1] + dp[i-2])%15746;
        }

        System.out.println(dp[num]);
    }
    
}
