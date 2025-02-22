package Loops;

public class reverse {
    public static void main(String[] args) {
        int n = 59682;
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = n%10;
            n = n/10;
            System.out.print(lastdigit);
        }
        
    }
}
