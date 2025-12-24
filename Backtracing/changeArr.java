package Backtracing;

public class changeArr {

    public static void inserting(int[] arr, int i, int val) {
        if(i == arr.length) {
            print(arr);
            return;
        }

        // recursion
        arr[i] = val;
        inserting(arr, i+1, val+1); // function call step
        arr[i] = arr[i]-2; //backtracing step
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[8];
        inserting(arr, 0, 1);
    }
}
