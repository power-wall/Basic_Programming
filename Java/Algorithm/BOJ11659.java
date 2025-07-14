package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] += arr[i-1] + Integer.parseInt(st.nextToken()); 
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            
            sb.append(arr[last] - arr[first-1]).append("\n");
          
        }

        System.out.println(sb);
    }
    
}
