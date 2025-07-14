package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(bf.readLine());
        int[] T = new int[days+1];
        int[] P = new int[days+1];
        int[] dp = new int[days+2];

        for(int i = 1; i <= days; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = days; i > 0; i--){
            int finishDay = i + T[i];

            if(finishDay <= days+1){
                dp[i] = Math.max(dp[i+1], dp[finishDay] + P[i]);
            }
            else{
                dp[i] = dp[i+1];
            }
        }

            System.out.println(dp[1]);
    }
    
}
