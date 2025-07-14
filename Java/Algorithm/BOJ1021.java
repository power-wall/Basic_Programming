package Java.Algorithm;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            deque.offer(i);
        }

        st = new StringTokenizer(bf.readLine());
        int cnt = 0;
        while (M>0) {
           int num = Integer.parseInt(st.nextToken());
           int index = deque.indexOf(num);
           int size = deque.size();

           if(index == 0){
                deque.poll();
           }
           else{
                if(index <= size/2){
                    for(int i = 0; i < index; i++){
                        deque.offer(deque.poll());
                        cnt++;
                    }
                }
                else{
                    for(int i = 0; i < size - index; i++){
                        deque.offerFirst(deque.pollLast());
                        cnt++;
                    }
                }

                deque.poll();
           }
           M--;
        }
        
        System.out.println(cnt);
    }
    
}
