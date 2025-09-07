package Recursion;

public class tilingProblem {
    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        };

        // horizontal
        int hri = ways(n-1);

        // vertical
        int ver = ways(n-2);
        
        return (hri + ver);
    }
    public static void main(String[] args) {
        System.out.println(ways(5));
    }
}
