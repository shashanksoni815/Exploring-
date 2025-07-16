import java.util.Scanner;

public class spiral {

    public static void printMatrixIndex(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // System.out.print("(" + i + "," + j + ")");
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int[][] matrix) {
        int statingRow = 0;
        int startingCol = 0;
        int endingRow = matrix.length -1;
        int endingCol = matrix.length -1;

        while (statingRow <= endingRow && startingCol <= endingCol) {
            // upper layer
            for (int j = statingRow; j <= endingCol; j++) {
                System.out.print(matrix[statingRow][j] + " ");
            }
            // right side 
            for (int i = statingRow+1; i <= endingCol; i++) {
                System.out.print(matrix[i][endingCol] + " ");
            }
            // bottom Side
            for (int j = endingRow-1; j >= startingCol; j--) {
                if (statingRow == endingRow) {
                    break;
                }
                System.out.print(matrix[endingRow][j] + " ");
            }
            // left Side 
            for (int i = endingRow-1; i >= startingCol+1 ; i--) {
                System.out.print(matrix[i][startingCol] + " ");
            }

            statingRow++;
            startingCol++;
            endingCol--;
            endingRow--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {   
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrixIndex(matrix);
        printSpiral(matrix);





        sc.close();
    }
}
