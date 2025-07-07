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

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value of array is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        // int numbers[] = {1, 2, 3, 4, 5,10, 4, 3, 2, 1};
        // int key = 10;
        // System.out.println(linearSearch(numbers, key));
        // String menu[] = {"dosa", "papad", "idly", "roti"};
        // String order = "roti";
        // System.out.println(stringSearch(menu, order));
        int numbers[] = {1, 2, 3, 4, 5,10, 4, 3, 16, 1};
        System.out.println("Largest value of array is : " + largest(numbers));
    }
}
