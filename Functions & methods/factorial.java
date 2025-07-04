import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter value of a : ");
        int a = sc.nextInt();
        // System.err.println("Enter value of b : ");
        // int b = sc.nextInt();
        System.out.println(fact(a));

        sc.close();
    }
}
