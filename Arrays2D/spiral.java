import java.util.Scanner;

public class spiral {

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int[][] matrix) {
        
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {   
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);





        sc.close();
    }
}
