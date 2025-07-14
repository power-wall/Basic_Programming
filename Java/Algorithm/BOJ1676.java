package Java.Algorithm;

import java.io.*;

public class BOJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int cnt = 0;
        while (num >= 5) {
            cnt += num/5;
            num /= 5;
        }

        System.out.println(cnt);
    }
}
