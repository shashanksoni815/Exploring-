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

    public static void romanToInteger(String rom) {
        int integer = 0;
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanvalue[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int i = 0;
        while (rom.length() > 0) {
            if (rom.startsWith(romanvalue[i])) {
                integer += values[i];
                rom = rom.substring(romanvalue[i].length());
            } else {
                i++;
            }
        }
        System.out.println(integer);
    }

    public static void main(String[] args) {
        // int a = 20;
        // integerToRoman(a);
        String rom = "XLVII";
        romanToInteger(rom);
    }
}
