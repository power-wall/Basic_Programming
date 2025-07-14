package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int num = Integer.parseInt(st.nextToken());
        int gap = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i = 0; i < gap; i++){
            sum += arr[i];    
        }

        int max = sum;
        for(int i = gap; i < num; i++){
            sum += arr[i] - arr[i - gap];
            max = Math.max(sum, max);
        }

        System.out.println(max);

    }
    
}
