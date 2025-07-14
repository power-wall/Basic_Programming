package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[num];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);

        int num2 = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[num2];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < num2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num2; i++){
            int target = arr2[i];
            int cnt =  upperBound(arr1, target) - lowerBound(arr1, target);
            sb.append(cnt).append(" ");
        }

        System.out.println(sb);
        bf.close();
        
    }

    public static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        
        while (low < high) {
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                high = mid;
            }
            else{
                low = mid +1;
            }
        }

        return low;
    }
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }


    
}
