package Arrays;

public class subArrays{
    public static void SubArr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(k + " ");
                }
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