package Java.Algorithm;

import java.io.*;

public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String equation = bf.readLine();
        String[] arr = equation.split("-");
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            String[] add = arr[i].split("\\+");

            int tmp = 0;
            for(String j : add){
                tmp += Integer.parseInt(j);
            }

            if(i == 0){
                sum += tmp;
            }
            else{
                sum -= tmp;
            }

        }
        System.out.println(sum);
    }
}
