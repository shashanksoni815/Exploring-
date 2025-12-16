package Arrays;

public class subArrays{
    public static void SubArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print(" '" + sum + "'");
                System.out.println();
            }
            // System.out.println();
        }

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SubArr(arr);
    }
}