package Java.Algorithm;

import java.io.*;

public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        
        int num = 666;
        int cnt = 1;

        while (true) {
             if(N==1){
                break;
            }
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
            if(cnt >= N){
                break;
            }
        }

        System.out.println(num);

    }
    
}
