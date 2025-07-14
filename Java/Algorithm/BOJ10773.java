package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            int cnt = Integer.parseInt(bf.readLine());
            if(cnt == 0){
                stack.pop();
            }
            else{
                stack.push(cnt);
            }
            num--;
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
