package Java.Algorithm;

import java.io.*;

public class BOJ11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(bf.readLine());
        int num = 0;

        while (M > 0) {
            String[] arr = bf.readLine().split(" ");
            String command = arr[0];
            int x = 0;

            if(arr.length > 1){
                x = Integer.parseInt(arr[1]);
            }

            switch (command) {
                case "add":
                    num |= (1 << (x-1));
                    break;
                case "remove":
                    num &= ~(1 << (x-1));
                    break;
                case "check":
                    sb.append((num & (1<< (x-1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    num ^= (1<<(x-1));
                    break;
                case "all":
                    num = (1 << 20) -1;
                    break;
                case "empty":
                    num = 0;
                    break;
            }
            M--;
        }

        System.out.println(sb);
    }

    
}
