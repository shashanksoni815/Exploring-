package Sorting;

// this idea comes from the insperation of boiling 
// water in which the bubble came up, in decending order.
// large bubble comes up and then smaller one and soo on.

// idea!
// large elements come to the end of array by 
// swaping with adjacent elements

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 1, 3, 7, 6};

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j <= (arr.length - 2 - i); j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.print(arr[j] + " ");
            }
            System.out.println(arr[i]);
        }
        for (int j = 0; j < arr.length; j++) {
            
            System.out.println(arr[j]);
        }


    }
}
