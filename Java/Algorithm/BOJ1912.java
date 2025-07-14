package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = arr[0];
        int max = arr[0];
        for(int i = 1; i < num; i++){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(sum, max);
        }

        System.out.println(max);


    }
}
