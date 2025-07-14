package Java.Algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11725 {
    static int num;
    static ArrayList<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(bf.readLine());

        tree = new ArrayList[num+1];
        parent = new int[num+1];
        visited = new boolean[num+1];

        for(int i = 1; i <= num; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < num-1; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1);

        for(int i = 2; i <= num; i++){
            System.out.println(parent[i]);
        }
        
    }

    static void dfs(int root){
        visited[root] = true;
        for(int child : tree[root]){
            if(!visited[child]){
                parent[child] = root;
                dfs(child); 
            }
        }
    }
}
