/*
 https://www.acmicpc.net/problem/10974
 모든 순열
 N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
 n 주어진다 (1<= n <=8)
 */

package Java.Algorithm;

import java.io.*;

public class BOJ10974 {

    static int num;
    static boolean visited[];
    static int result[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bf.readLine());

        visited = new boolean[num+1];
        result = new int[num];

        dfs(0);

        System.out.println(sb);
    }
    


public static void dfs(int depth){
        if(depth == num){
            for(int i = 0; i < num; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
        }

        for(int i = 1; i <= num; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
