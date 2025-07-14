package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[10001];
        
        for(int i = 0; i < num; i++){
            arr[Integer.parseInt(bf.readLine())]++;
        }

       

        for (int i = 1; i <= 10000; i++) {
            while (arr[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

        
    }
    
}
