package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=num; i++){
            queue.offer(i);
        }

        while (num > 1) {
            queue.poll();
            queue.offer(queue.poll());
            num--;
        }

        System.out.println(queue.peek());

    }
    
}
