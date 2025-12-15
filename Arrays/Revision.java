package Arrays;

public class Revision {
    public static int BinarySearch(int[] arr) {
        int target = 5;

        int start = 0, end = arr.length-1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] <= target) {
                start = mid+1;
            }
            if (arr[mid] >= target) {
                end = mid-1;
            } 
        }
        return -1;
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
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        // BinarySearch(arr);
        System.out.print(BinarySearch(arr));
    }
}
