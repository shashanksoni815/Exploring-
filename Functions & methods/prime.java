import java.util.Scanner;

public class prime {
    public static boolean isPrime(int a) {
        boolean isPrime = true;
        for(int i = 2; i < a; i++) {
            if(a%i == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter value is prime : ");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
        sc.close();
    }
}
