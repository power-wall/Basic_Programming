package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();

        Integer[] arr = new Integer[num.length()];
        for(int i = 0; i < num.length(); i++){
            arr[i] = num.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < num.length(); i++){
            System.out.print(arr[i]);
        }

    }
    
}
