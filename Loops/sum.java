package Loops;

public class sum {
    public static void main(String[] args) {
        int n = 0;
        int s = 8;

        while (n <= s) {
            System.out.println(n);
            n++;
            n+=n;
        }
        System.out.println("total sum" + n);
    }
}
