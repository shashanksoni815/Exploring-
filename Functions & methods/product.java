import java.util.Scanner;

public class product {
    public static int multiple(int a, int b) {
        return (a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter value of a : ");
        int a = sc.nextInt();
        System.err.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println(multiple(a, b));
        System.out.println(multiple(30, 50));

        sc.close();
    }
}
