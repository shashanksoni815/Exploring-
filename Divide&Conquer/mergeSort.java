// package Divide&Conquer;

public class mergeSort {

    public static void printArr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    public static void mergesort(int arr[], int si, int ei) {
        if(si >= ei) return;

        int mid = si + (ei - si)/2;

        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];

        int i = si; //index for 1st sorted part
        int j = mid+1; //index for 2nd sorted part
        int k = 0; // temerary index

        while(i <= mid && j <= ei){
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //for eight over element
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,6,5,3,2};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
