import java.util.Scanner;

public class binomialCoefficient {
    public static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static int biCoefficient(int n, int r) {
        int coe = 1;
        int a = fact(n);
        int b = fact(r);
        int nr = (n-r);
        nr = fact(nr);
        int c = (b * nr);
        coe = ( a / c);

        return coe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter value of a : ");
        int n = sc.nextInt();
        System.err.println("Enter value of b : ");
        int r = sc.nextInt();
        System.out.println(biCoefficient(n, r));

        sc.close();
    }
}
