package Java.Algorithm;

import java.io.*;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= num; i++){
            while (num%i == 0) {
                num = num/i;
                sb.append(i).append("\n");
            }

            if(num == 1){
                break;
            }
        }

        System.out.println(sb);
    }
    
}
