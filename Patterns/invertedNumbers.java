package Patterns;

public class invertedNumbers {
    public static void main(String[] args) {
        int num = 8;
        for(int i = 1; i <= num; i++) {
            int count = 1;
            for(int j = num; j>=i; j-- ){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
