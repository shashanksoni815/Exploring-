package Arrays;

public class Revision {
    public static void assending(int[] arr) {
        int sort[]; 
        // sort.length = arr.length;
    }
    
    public static int largest(int[] arr) {
        int large = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        return large;
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 8, 10, 3, 6, 9};
        assending(arr);
        System.out.print(largest(arr));
    }
}
