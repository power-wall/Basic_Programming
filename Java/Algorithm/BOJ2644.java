/*
 * https://www.acmicpc.net/problem/2644
 * 촌수 계산
 *  문제가 길어요~
 */

package Java.Algorithm;

import java.io.*;
import java.util.*;

public class BOJ2644 {
    
    static int num;
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int[] distance;



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bf.readLine());

        int start, end;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(bf.readLine());

        visited = new boolean[num + 1];
        distance = new int[num + 1];

        graph = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st1 = new StringTokenizer(bf.readLine());
            int parent = Integer.parseInt(st1.nextToken());
            int child = Integer.parseInt(st1.nextToken());
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }

        bfs(start, end);

    }

    static void bfs(int start, int end){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if(current == end){
                System.out.println(distance[end]);
                return;
            }

            for(int next : graph.get(current)){
                if(!visited[next]){
                    visited[next] = true;
                    distance[next] = distance[current]+1;
                    queue.offer(next);
                }
            }
        }

        System.out.println("-1");
    }
}