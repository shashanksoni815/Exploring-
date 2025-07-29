public class hexaDecimal {

    public static void decimalToHexadecimal(int num) {
        int hex = 0;
        int power = 0;
        while(num > 0){
            int dig = (num%16) * (int)Math.pow(10, power);
            hex = hex + dig;
            power++;
            num /= 16;
        }
        System.out.println(hex);
    }

    public static void hexaToDecimal(int num) {
        int hex = 0;
        int power = 0;
        while(num > 0){
            int dig = (num%10) * (int)Math.pow(16, power);
            hex = hex + dig;
            power++;
            num /= 10;
        }
        System.out.println(hex);
    }

    public static void main(String[] args) {
        int num = 68;
        decimalToHexadecimal(num);
        int hex = 44;
        hexaToDecimal(hex);
    }
}
