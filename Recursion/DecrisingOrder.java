package Recursion;

public class DecrisingOrder {
    public static void printDec(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static int naturalNumberSum(int n) {
        if(n <= 0){
            return 0;
        }
        int f = naturalNumberSum(n-1);
        int sum = n + f;
        return sum;
    }

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);
        int fib = fib1 + fib2;
        return fib;
    }

    public static boolean isSorted(int array[], int i ) {
        if(i == array.length-1){
            return true;
        }

        if (array[i] > array[i+1]) {
            return false;
        }

        return isSorted(array, i+1);

    }
    
    public static int target(int array[], int i, int key) {
        if (i == array.length) {
            return -1;
        }
        if(array[i] == key){
            return i;
        }
        return target(array, i+1, key);
    }
    public static int lastOccuring(int array[], int i, int key) {
        if (i == array.length) {
            return -1;
        }
        int isFound =  lastOccuring(array, i+1, key);
        if( isFound == -1 && array[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int n, int p) {
        if (p == 1) {
            return n;
        }
        int ans = n * power(n, p-1);
        return ans;
    }
    
    public static void main(String[] args) {
        // int array[] = {1, 2, 5, 3, 4, 5, 6};
        // System.out.println(naturalNumberSum(n));
        // System.out.println(target(array, 0,5));
        // System.out.println(lastOccuring(array, 0,5));
        System.out.println(power(2, 8));
    }
}
