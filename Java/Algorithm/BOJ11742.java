package Java.Algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11742 {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
            }

            visited = new boolean[N+1];
            int cnt = 0;
            for(int i = 1; i <= N; i++){
                if(!visited[i]){
                    dfs(i);
                    cnt++;
                }
            }

            System.out.println(cnt);
    }

    public static void dfs(int node){
        visited[node] = true;

        for(int i : graph.get(node)){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
    
    
}
