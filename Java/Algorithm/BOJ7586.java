package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ7586 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[][] pair = new int[num][2];

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            pair[i][0] = Integer.parseInt(st.nextToken());
            pair[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<num; i++){
            int cnt = 1;
            for(int j = 0; j < num; j++){
                if(pair[i][0] < pair[j][0] && pair[i][1] < pair[j][1]){
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
        }

        System.out.println(sb);


    }
    
}
