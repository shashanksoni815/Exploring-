import java.util.*;

public class matrix {

    public static void main(String[] args) {
        int matrix[][] = new int [3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int key = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("matrix value is fount at: " + "("+ i + "," + j + ")");
                 } //else{
                //     System.out.println("key not found");
                // }
            }
        }
        //     System.out.println("key not found");


        sc.close();
    }
}