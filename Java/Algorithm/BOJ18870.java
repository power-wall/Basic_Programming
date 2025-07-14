package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        int[] arr2 = new int[num];
        Map<Integer, Integer> map = new HashMap<>();


        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        int cnt = 0;
        for(int i = 0; i < num; i++){
            if(!map.containsKey(arr2[i])){
               map.put(arr2[i], cnt);
               cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);



        
    }
    
}
