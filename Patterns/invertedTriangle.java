package Patterns;

public class invertedTriangle {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                if (n-j+1 > i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");

                }
            }
            System.out.println();
        }
    }
}
