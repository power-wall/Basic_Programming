/*
 * https://www.acmicpc.net/problem/1182
 * 부분수열의 합
 * N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 
 * 되는 경우의 수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다.
 * 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 
 * 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다.
 */

package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1182 {

    static int N;
    static int S;
    static int arr[];
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(0, 0);

        if(S == 0){
            cnt--;
        }

        System.out.println(cnt);

    }

    public static void dfs(int depth, int sum){
        if(depth == N){
            if(sum == S){
                cnt++;
            }
            return;
        }

        dfs(depth+1, sum + arr[depth]);
        dfs(depth+1, sum);
    }
}


