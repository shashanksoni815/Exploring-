package Arrays;

public class reverse {

    public static void rev(int numbers[] ) {
        int first = 0, last = numbers.length-1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            last--;
            first++;
        }
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean dublicate(int nums[]) {
        // boolean duble = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // rev(numbers);
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(dublicate(nums));
    }
}
