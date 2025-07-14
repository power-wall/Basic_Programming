package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] dp = new int[a][b];

        for(int i = 0; i < a; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for(int i = 0; i < a; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }



    }
    
}
