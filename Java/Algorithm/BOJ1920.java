package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        String[] input = bf.readLine().split(" ");
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int num2 = Integer.parseInt(bf.readLine());
        int[] target = new int[num2];
        input = bf.readLine().split(" ");
        for(int i = 0; i < num2; i++){
            target[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        for(int i = 0; i < num2; i++){
            if(binarySearch(arr, target[i])){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }


    
    }

    public static boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high)/2;
            
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }

        return false;
    }
    
}
