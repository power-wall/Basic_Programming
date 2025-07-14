package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int level = 1;
        int cnt = 1;
        while (num > cnt) {
           level++;
           cnt += level;
        }

        int lastNum = (level * (level+1))/2;
        int order = num -(lastNum - level);


        int bunja, bunmo;
        if(level % 2 == 0){ // 분자 증가, 분모 감소
            bunja = order;
            bunmo = level - order +1;
        }
        else{ // 반대
            bunja = level - order + 1;
            bunmo = order;

        }

        System.out.println(bunja + "/" + bunmo);

    }
    
}
