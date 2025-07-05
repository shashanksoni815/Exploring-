import java.util.Scanner;

public class palindrome {
    public static void symetric(int num) {
        int n = num;
        int sym = 0;
        boolean isPalindrone = false;

        while(num > 0) {
            int rev = num%10;
            sym = (sym * 10) + rev;
            num = num/10;
        }
        if (n == sym) {
            isPalindrone = true;
        }
        System.out.println("input number " + n + " is palindrone : " + isPalindrone );


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int dec = 0;
        symetric(num);

        sc.close();
    }
}
