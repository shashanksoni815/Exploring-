public class IntegerToRoman {

    public static void integerToRoman(int a) {
        String roman = "";
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanvalue[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (a >= values[i]) {
                roman = roman + romanvalue[i];
                a -= values[i];
            }
        }
        System.out.println(roman);
    }

    public static void main(String[] args) {
        int a = 20;
        integerToRoman(a);
    }
}
