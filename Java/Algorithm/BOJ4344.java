package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

class BOJ4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int sub = Integer.parseInt(st.nextToken());
            int[] arr = new int[sub];
            double sum = 0;

            for(int j = 0; j < sub; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            
            double avg = sum / sub;
            int cnt = 0;

            for(int j = 0; j<sub; j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }

            double per = (cnt*100.0)/sub;
            System.out.println(per+"%");

        }
        
    }
    
}