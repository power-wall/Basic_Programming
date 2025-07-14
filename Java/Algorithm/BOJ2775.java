package Java.Algorithm;
import java.io.*;

public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(bf.readLine());
        int N, K;
        int[][] dp = new int[15][15];

        for(int i = 1; i <= 14; i++){
            dp[0][i] = i;
        }   

        for(int i = 1; i <= 14; i++){
            for(int ii = 1; ii <= 14; ii++){
                dp[i][ii] = dp[i-1][ii] + dp[i][ii-1];
            }
        }


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testcase; i++){
            K = Integer.parseInt(bf.readLine());
            N = Integer.parseInt(bf.readLine());

            sb.append(dp[K][N]).append("\n");
        }

        System.out.println(sb);
        
    }
}
