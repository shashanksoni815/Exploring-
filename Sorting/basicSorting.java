package Sorting;
import java.util.Arrays;

public class basicSorting {

    public static void countSort() {
        int arra[] = {1, 4, 1, 3, 2, 4, 3, 7};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arra.length; i++) {
            largest = Math.max(largest, arra[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < arra.length; i++) {
            count[arra[i]]++;
        }
        // sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arra[j] = i;
                j++;
                count[i]--;
            }
        }

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
