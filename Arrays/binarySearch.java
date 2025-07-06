package Arrays;

// Binary search is same as the sotted part
// like a disctionary.


public class binarySearch { 
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 80;

        int start = 0, end = num.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comaprision
            if (num[mid] == key) { //found
                System.out.println(mid);
                break;
            }
            if (num[mid] < key) { //right
                start = mid+1;
            } else { // left
                end = mid-1;
            }
        }
        System.out.println("not found");
    }
}
