package Java.Algorithm;

import java.io.*;

public class BOJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        if(num < 10){
            num *= 10;
        }

        int origin = num;
        int cnt = 0;
        while (true) {
            cnt++;
            int tmp = (num / 10) + (num % 10);
            num = (num % 10 * 10) + tmp % 10;
            
            if(num == origin){
                break;
            }
        }

        System.out.println(cnt);
    }
    
}
