package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 1, 3, 7, 6};

        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for (int index = 0; index < arr.length; index++) {
            
            System.out.print(arr[index] + " ");
        }
    }
}
