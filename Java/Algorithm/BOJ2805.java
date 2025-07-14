package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr[N-1];
        int H = 0;

        while (right >= left) {
            int mid = (left+right)/2;
            int cnt = 0;

            for(int i = 0; i < N; i++){
                if(arr[i] > mid){
                    cnt += arr[i] - mid;
                }
            }

            if(cnt >= M){
                H = mid;
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println(H);
       
    }
}
