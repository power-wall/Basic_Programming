package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15650 {
    static int N,M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[M];

        backtrack(1, 0);

        System.out.println(sb);
    }

    public static void backtrack(int stan, int depth){
        if(depth == M){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = stan; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                backtrack(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
}
