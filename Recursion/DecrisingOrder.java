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
    public static void main(String[] args) {
        int array[] = {1, 5, 3, 4, 5, 6};
        // System.out.println(naturalNumberSum(n));
        System.out.println(isSorted(array, 0));
    }
}
