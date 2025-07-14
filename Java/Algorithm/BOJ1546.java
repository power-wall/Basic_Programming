package Java.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        double[] score = new double[num];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        double maxNum = 0;
        for(int i = 0; i < num; i++){
            score[i] = Double.parseDouble(st.nextToken());
            if(score[i] > maxNum){
                maxNum = score[i];
            }
        }

       double sum = 0;
       for(int i = 0; i < num; i++){
        score[i] = (score[i]/maxNum)*100;
        sum += score[i];
       }

       System.out.println(sum/num);

    }
    
}
