package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        long[] distnace = new long[num-1];
        long[] cost = new long[num];


        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num-1; i++){
            distnace[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            cost[i] = Long.parseLong(st.nextToken());
        }

        long minCost = cost[0];
        long total = 0;
        for(int i = 0; i < num-1; i++){
           total += minCost * distnace[i];
           if(minCost > cost[i+1]){
                minCost = cost[i+1];
           }
        }

        System.out.println(total);

    }

    
}
