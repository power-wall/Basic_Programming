package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        

        while (num > 0) {
            String str = bf.readLine();
            boolean vps = checkVps(str);

            if(vps){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            num--;
        }

    
    }

    public static boolean checkVps(String str){
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == '('){
                cnt++;
            }
            else{
                cnt--;
                if(cnt < 0){
                    return false; // )가 먼저 나와버림
                }
            }

        }


        return cnt == 0;
    }
}
