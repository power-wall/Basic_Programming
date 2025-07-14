package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long maxValue = 0;

        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);
        
        long left = 1, right = arr[K-1];
        while (left <= right) {
            long mid = (left + right)/2;
            long cnt = 0;

            for(int i = 0; i < K; i++){
                cnt += arr[i] / mid;
            }

            if(cnt >= N){
                maxValue = mid;
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }

        System.out.println(maxValue);
    }
    
}
