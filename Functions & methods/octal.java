public class octal {

    public static void decimalToOctal(int num) {
        int octal = 0;
        int power = 0 ;
        while (num > 0 ) {
            int dig = num % 8;
            octal = octal + dig * (int)Math.pow(10, power);
            num /= 8;
            power++;
        }
        System.out.println(octal);
    }

    public static void main(String[] args) {
        int num = 68;
        decimalToOctal(num);
    }
}
