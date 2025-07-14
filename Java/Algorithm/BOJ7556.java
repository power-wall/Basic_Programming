/*
 * https://www.acmicpc.net/problem/7576
 * 토마토
 * M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수를 나타낸다
 * 정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다.
 * 익은 토마토 상하좌우 인접한 곳에 있는 안 익은 도마도는 하루 후 익는다
 * 모든 도마도가 며칠이 지나면 다 익는지 최소 일수
 * 모두 익지 못하면 -1 출력
 */


package Java.Algorithm;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7556 {

    static int box[][];
    static int M, N;
    static Queue<int[]> Queue = new LinkedList<>();
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1 ,1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        for(int i = 0; i < N; i++){
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for(int j = 0; j < M; j++){
                box[i][j] = Integer.parseInt(st2.nextToken());
                if(box[i][j] == 1){
                    Queue.add(new int[]{i, j});
                }
            }
        }

        bfs();

        int cnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(box[i][j] == 0){
                    System.out.println(-1);
                    return;
                }

                cnt = Math.max(cnt, box[i][j]);
            }
        }

        System.out.println(cnt -1);
        
    }

    static void bfs(){
        while (!Queue.isEmpty()) {
            int[] now = Queue.poll();
            int x = now[0];
            int y = now[1];

            for(int i = 0; i < 4; i++){
                int mx = x + dx[i];
                int my = y + dy[i];

                if(mx < N && mx >= 0 && my < M && my >= 0){
                    if(box[mx][my] == 0){
                        box[mx][my] = box[x][y] + 1;
                        Queue.add(new int[]{mx, my});
                    }
                }
            }


        }


    }
    
}
