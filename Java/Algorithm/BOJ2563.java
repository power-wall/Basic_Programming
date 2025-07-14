package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        boolean[][] paper = new boolean[100][100];
        int sum = 0;

        for(int i = 0; i < num; i++){

            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y +10; k++){
                    if(!paper[j][k]){
                        paper[j][k] = true;
                        sum++;
                    }
                }
            }
        }



        System.out.println(sum);



        
    }
}
