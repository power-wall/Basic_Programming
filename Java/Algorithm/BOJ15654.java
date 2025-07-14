package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15654 {

    static int N;
    static int M;
    static int[] arr;
    static int[] arr2;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        arr2 = new int[M];
        visited = new boolean[N+1];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        backTrack(0);

        System.out.println(sb);
        
    }

    public static void backTrack(int depth){
        if(depth == M){
            for(int num : arr2){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++){
           if(!visited[i]){
                visited[i]= true;
                arr2[depth] = arr[i];
                backTrack(depth+1);
                visited[i] = false;
           }
        }


    }
    
}
