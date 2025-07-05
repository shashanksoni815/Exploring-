import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int bin = 0;
        int pow = 0;

        while (dec > 0) {
            int r = dec % 2;
            bin = bin + (r * (int)Math.pow(10, pow));
            dec = dec/2;
            pow++;
        }

        System.out.println(bin);
        sc.close();
    }
}
