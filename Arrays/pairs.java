package Arrays;

public class pairs {
    public static void pair(int numbers[]) {
        int tp = 0;
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total no of pairs are : " + tp);
    }

    public static void subArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                // System.out.print(numbers[j] + " ");
                for (int k = i; k <= j; k++) {
                    sum += numbers[k]; 
                    System.out.print(numbers[k] + " "  );
                }
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubarraySum(int max[]) {
        for (int i = 0; i < max.length; i++) {
            for (int j = i; j < max.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += max[j];
                }
                System.out.print(sum + " ");
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // // pair(numbers);
        // subArray(numbers);
        int max[] = {1, -2, 6, -1, 3};
        maxSubarraySum(max);
    }
}
