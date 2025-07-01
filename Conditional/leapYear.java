import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4 == 0) {
            System.out.println("It is a leap year = " + year);
        } else {
            System.out.println("It is not a leap year = " + year);
        }
        sc.close();
    }
}
