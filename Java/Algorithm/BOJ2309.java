package Java.Algorithm;

import java.io.*;
import java.util.Arrays;

public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        int a = 0, b = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            if(i != a && i != b){
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);

    }
    
}
