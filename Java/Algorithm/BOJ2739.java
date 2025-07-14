package Java.Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for(int i = 1; i < 10; i++){
            int sum = i * num;
            System.out.printf("%d * %d = %d\n", num, i, sum);
        }

        bf.close();
    }
    
}
