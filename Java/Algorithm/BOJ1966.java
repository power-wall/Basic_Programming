package Java.Algorithm;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < num; j++){
                int prio = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{prio, j});
                priorityQueue.offer(prio);
            }

            int cnt = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int value = current[0];
                int index = current[1];

                if(value == priorityQueue.peek()){
                    priorityQueue.poll();
                    cnt++;
                    if(index == target){
                        sb.append(cnt).append("\n");
                        break;
                    }
                }
                else{
                    queue.offer(current);
                }
            }

        }

        System.out.println(sb);
    }

    
}
