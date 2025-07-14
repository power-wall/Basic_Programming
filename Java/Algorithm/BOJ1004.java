/*
 * https://www.acmicpc.net/problem/1004
 * 어린 왕자
 */

package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1004 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        while (testcase > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int num = Integer.parseInt(bf.readLine());
            int cnt = 0;
            for(int i = 0; i < num; i++){

                StringTokenizer st2 = new StringTokenizer(bf.readLine());
                int cx = Integer.parseInt(st2.nextToken());
                int cy = Integer.parseInt(st2.nextToken());
                int r = Integer.parseInt(st2.nextToken());

                boolean startIn = checkIn(x1, y1, cx, cy, r);
                boolean targetIn = checkIn(x2, y2, cx, cy, r);

                if(startIn ^ targetIn){
                    cnt++;
                }

            }
            
            sb.append(cnt).append("\n");
            testcase--;

        }
        System.out.println(sb);
       

    }

    static boolean checkIn(int x, int y, int cx, int cy, int r){
        int dx = x - cx;
        int dy = y - cy;
        return dx*dx + dy*dy < r*r;
    }

    
}
