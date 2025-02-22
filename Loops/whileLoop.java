package Loops;
public class whileLoop {
    public static void main(String args[]){
        int a = 2;
        // int b = 1;
        while (a <= 20) {
            // System.out.println(`2 x ${b} = ${a} `);
            System.out.println( a);
            a *= 2;
        }
        int sum = 0;
        int n = 15;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of num is = " + sum);
    }
}