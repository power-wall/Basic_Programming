package Java.Algorithm;

import java.io.*;

public class BOJ9461 {

    static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(bf.readLine());
    
            for(int i = 0; i < testCase; i++){
                int num = Integer.parseInt(bf.readLine());
                solving(num);
                sb.append("\n");
            }

            System.out.println(sb);
        }
    
        public static void solving(int num){
            if (num == 1 || num == 2 || num == 3) {
                sb.append(1);
                return;
            }
            
            long[] dp = new long[num+1];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;


            for(int i = 4; i <= num; i++){
                dp[i] = dp[i-2] + dp[i-3];
            }
            
            sb.append(dp[num]);
    }
}
