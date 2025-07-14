package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        int[] dp = new int[num];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 1;
        for(int i = 0; i < num; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);                    
                }

            }

            cnt = Math.max(cnt, dp[i]);
        }

        System.out.println(cnt);

       



    }
    
}
