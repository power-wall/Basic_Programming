/*
 * https://www.acmicpc.net/problem/10844
 * 쉬운 계단 수
 * 
 * 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수
 * 길이가 N인 계단 수가 총 몇 개 있는지 구해
 */

 package Java.Algorithm;

 import java.io.*;

 public class BOJ10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        long[][] dp = new long[num+1][10];
        
        for(int i = 1; i <= 9; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= num; i++){ //길이가 i이고, 마지막 숫자가 j인 계단 수의 개수
            for(int j = 0; j <= 9; j++){
                if(j>0){
                    dp[i][j] += dp[i-1][j-1];
                }
                if(j<9){
                    dp[i][j] += dp[i-1][j+1];
                }
                dp[i][j] %= 1000000000;
            }
        }

        long result = 0;
        for(int i = 0; i <= 9; i++){
            //result += dp[num][i];
            result = (result + dp[num][i]) % 1000000000;
        }

        System.out.println(result);
    }
    
 }