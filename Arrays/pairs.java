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
        // Brute Force
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < max.length; i++) {
            for (int j = i; j < max.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += max[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
                // System.out.print(sum + " ");
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void maxSubarraySum2(int max[]) {
        // Prefix Sum
        int maxSum = Integer.MIN_VALUE;
        int size = max.length;
        int sum = 0;
        int prefix[] = new int[size];

        // to calculate prefix array
        prefix[0] = max[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + max[i];
        }

        // calculating maximum of array
        for (int i = 0; i < max.length; i++) {
            for (int j = i; j < size; j++) {
                
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void maxSubarraySum3(int largest[] ) {
        // Kadane's Algorithm
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < largest.length; i++) {
            sum = sum + largest[i];
            if (sum < 0) {
                sum = 0;
            }
            maximum = Math.max(sum, maximum);
        }
        System.out.println(maximum);

    }

    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // // pair(numbers);
        // subArray(numbers);
        // int max[] = {1, -2, 6, -1, 3};
        int largest[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // maxSubarraySum(max);
        // maxSubarraySum2(max);
        maxSubarraySum3(largest);
    }
}
