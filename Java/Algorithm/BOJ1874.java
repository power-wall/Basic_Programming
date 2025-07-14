package Java.Algorithm;

import java.io.*;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num+1];

        for(int i = 1; i <= num; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        int index = 1;
        for(int i = 1; i <= num; i++){
            stack.push(i);
            sb.append("+").append("\n");

            while (!stack.isEmpty() && stack.peek() == arr[index]) {
                stack.pop();
                sb.append("-").append("\n");
                index++;
            }
        }

        if(stack.isEmpty()){
            System.out.println(sb);
        }
        else{
            System.out.println("NO");
        }



    }
    
}
