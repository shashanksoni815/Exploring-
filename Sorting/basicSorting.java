package Sorting;
import java.util.Arrays;

public class basicSorting {

    public static void countSort() {
        
    }

    public static void inbuildSort(int arr[]) {
        // Inbuild Sort
        Arrays.sort(arr);
    }
    
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 2};
        inbuildSort(arr);
    }
}
