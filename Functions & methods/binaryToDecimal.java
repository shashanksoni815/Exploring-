import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0;
        int pow = 0;

        // for(int i = 0; i < bin; i++){
        //     int p = bin % 10;
        //     // dec = bin%10;
        //     dec = dec + (p * (int)(Math.pow(2, i)));
        //     bin = bin/10;
        // }
        // System.out.println(dec);
        while (bin > 0) {
            int ld = bin%10;
            dec = dec + (ld * (int)Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }
        System.out.println(dec);
        sc.close();
    }
}
