package Java.Algorithm;

import java.io.*;

public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        while (num-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            sb.append(cal(n)).append("\n");
        }

        System.out.println(sb);

    }
    
    public static int cal(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}
