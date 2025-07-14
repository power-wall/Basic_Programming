/*
 * https://www.acmicpc.net/problem/14888
 * 연산자 끼워넣기
 * 수열이 주어짐
 * 덧셈, 뺄셈, 곱셈, 나눗셈 갯수
 * 조합해서 최대와 최소 구해라
 * 무조건 앞에서부터 연산산
 */

 package Java.Algorithm;

 import java.io.*;
 import java.util.StringTokenizer;

 public class BOJ14888 {

    static int num;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        num = Integer.parseInt(bf.readLine());
        arr = new int[num];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int add, sub, mul, div;

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        add = Integer.parseInt(st2.nextToken());
        sub = Integer.parseInt(st2.nextToken());
        mul = Integer.parseInt(st2.nextToken());
        div = Integer.parseInt(st2.nextToken());

        dfs(1, arr[0], add, sub, mul, div);

        System.out.println(max);
        System.out.println(min);




    }

    public static void dfs(int index, int result, int add, int sub, int mul, int div){
        if(index == num){
            max = Math.max(result, max);
            min = Math.min(result, min);
        }


        if(add>0){
            dfs(index+1, result + arr[index], add-1, sub, mul, div );
        }
        if(sub>0){
            dfs(index+1, result - arr[index], add, sub-1, mul, div );
        }
        if(mul>0){
            dfs(index+1, result * arr[index], add, sub, mul-1, div );
        }
        if(div>0){
            dfs(index+1, result / arr[index], add, sub, mul, div-1 );
        }

    }
 }