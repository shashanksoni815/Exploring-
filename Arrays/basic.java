package Arrays;

public class basic {
    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int stringSearch(String menu[], String order) {
        for(int i = 0; i < menu.length; i++) {
            if (menu[i] == order) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int numbers[] = {1, 2, 3, 4, 5,10, 4, 3, 2, 1};
        // int key = 10;
        // System.out.println(linearSearch(numbers, key));
        String menu[] = {"dosa", "papad", "idly", "roti"};
        String order = "roti";
        System.out.println(stringSearch(menu, order));

    }
}
