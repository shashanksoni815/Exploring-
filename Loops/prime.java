import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=2; i < n; i++ ) {
        for(int i=2; i <= Math.sqrt(n) ; i++ ) {
            if ((n%i) == 0) {
                System.out.println("not a prime: " + n);
                sc.close();
                return;
            } 
        }
        System.out.println("prime number: " + n);

        sc.close();
    }
}
