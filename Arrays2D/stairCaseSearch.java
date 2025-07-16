public class stairCaseSearch {

    public static boolean stairCase(int[][] matrix, int key) {
        int row = 0, col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.print("Found key at (" + row + "," + col +")");
                return true;
            } else if(key < matrix[row][col]){
                col--;
            } else{

                row++;
            }
        }
        
        
        
        
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}}; 

        int key = 12;

        stairCase(matrix, key);

    }
}
