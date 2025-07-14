package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= num; i++){
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            for(int i = 0; i < k -1; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            if(queue.isEmpty()){
                break;
            }
            sb.append(", ");
        }

        sb.append(">");

        System.out.println(sb);


    }
    
}
