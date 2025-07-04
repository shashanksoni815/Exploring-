import java.util.Scanner;

public class basic {
    public static int square(int a) {
        int sqrt = a*a;
        return sqrt;
    }
    public static boolean evenOdd(int a) {
        if (a%2 == 0) {
            return true;
        } return false;
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter value of a : ");
        int a = sc.nextInt();
        System.err.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Square is : " + square(a));
         swap(a, b);
        
        System.out.println("Is Even : " + evenOdd(a));
        sc.close();
    }
}