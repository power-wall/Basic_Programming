package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bf.readLine());

        String num2 = bf.readLine();
        int[] b = new int[num2.length()];
        for(int i = 0; i < num2.length(); i++){
            b[i] = num2.charAt(i) - '0';
        }

        int sum = 0;
        for(int i = num2.length() -1; i >= 0; i--){
            int product = num1 * b[i];
            System.out.println(product);
            sum += (int)(product * Math.pow(10, num2.length() -1 - i));
        }
        System.out.println(sum);

      bf.close();
        
    }
    
}
