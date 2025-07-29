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

    public static void octalToDecimal(int oct) {
        int dec = 0;
        int power = 0;
        while (oct > 0) {
            int dig = oct % 10;
            dec = dec + dig * (int)Math.pow(8, power);
            oct /= 10;
            power++;
        } 
        System.out.println(dec);
    }

    public static void main(String[] args) {
        int num = 68;
        decimalToOctal(num);
        int oct = 104;
        octalToDecimal(oct);
    }
}
