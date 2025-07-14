package Java.Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        
        int num = Integer.parseInt(bf.readLine());
        int[][] points = new int[num][2];

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, (a,b)->{
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];

        }); 

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
