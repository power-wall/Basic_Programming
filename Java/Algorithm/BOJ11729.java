/*
 * https://www.acmicpc.net/problem/11729
 * 하노이의 탑
 *
 */

 package Java.Algorithm;
 

 import java.io.*;

 public class BOJ11729 {

   static StringBuilder sb = new StringBuilder();
   static int cnt = 0;
   
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        hanoi(num, 1, 3, 2);

        System.out.println(cnt);
        System.out.println(sb);
       
    }

    public static void hanoi(int num, int come, int where, int assist){
         if(num == 1){
            sb.append(come).append(" ").append(where).append("\n");
            cnt++;
            return;
         }

         hanoi( num -1, come, assist, where);
         sb.append(come).append(" ").append(where).append("\n");
         cnt++;
         hanoi(num-1, assist, where, come);
    }
    
 }