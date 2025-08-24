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

    public static void fibonacci(int n) {
        
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(naturalNumberSum(n));
    }
}
