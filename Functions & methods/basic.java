public class basic {
    public static int square(int a) {
        int sqrt = a*a;
        return sqrt;
    }
    public static boolean evenOdd(int a) {
        if (a%2 == 0) {
            return true;
        } return false;
    }
    public static void main(String[] args) {
        int a = 13;
        System.out.println("Square is : " + square(a));
        System.out.println("Is Even : " + evenOdd(a));

    }
}