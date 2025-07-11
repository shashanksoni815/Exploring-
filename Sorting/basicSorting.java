package Sorting;
import java.util.Arrays;

public class basicSorting {
    public static void main(String[] args) {
        // Inbuild Sort
        int arr[] = {1, 4, 5, 3, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
