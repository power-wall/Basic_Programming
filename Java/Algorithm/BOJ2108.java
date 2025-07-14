package Java.Algorithm;

import java.io.*;
import java.util.Arrays;


public class BOJ2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        int sum = 0;

        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        
        sb.append(Math.round((double)sum/num)).append("\n");

        sb.append(arr[num/2]).append("\n");

        int[] index = new int[8001];
        int maxValue = 0;

        for(int i = 0; i < num; i++){
            index[arr[i] + 4000]++;
            maxValue = Math.max(maxValue, index[arr[i]+4000]);
        }

        int realMax = 0;
        boolean secondMax = false;
        for(int i = 0; i < 8001; i++){
            if(index[i] == maxValue){
                realMax = i - 4000;
                if(secondMax){
                    break;
                }
                secondMax = true;
            }

        }
        sb.append(realMax).append("\n");
        sb.append(arr[num-1] - arr[0]).append("\n");

        System.out.println(sb);

        






        
    }
}
