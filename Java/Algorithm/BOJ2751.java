package Java.Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        quicksort(arr, 0, num-1);

        for(int i =0; i < num; i++){
            System.out.println(arr[i]);
        }


        
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
           int pi = partition(arr, low, high);

           quicksort(arr, low, pi-1);
           quicksort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low +1)+low;
        swap(arr, low, pivotIndex);

        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= high && arr[i] <= pivot) {
                i++;                
            }       
            while (arr[j] > pivot) {  
                j--;
            }
            if(i > j){
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, low, j);
       
        return j;
    }

    public static void swap(int[] arr, int low, int high){
        int tmp = arr[low];
        arr[low] = arr[high];
        arr[high] = tmp; 
    }

}
