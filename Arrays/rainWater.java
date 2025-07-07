package Arrays;

public class rainWater {
    public static void main(String[] args) {
        int height[] = {1, 2, 0, 3, 2, 0, 1, 2}; 
        int left[] = {1, 2, 2, 3, 3, 3, 3, 3};
        int right[] = {3, 3, 3, 3, 2, 2, 2, 2};
        int result = 0;
    
        for(int i = 0; i < height.length; i++){
            result = result + (Math.min(left[i] , right[i]) - height[i] );
        }
        System.out.println(result);
    }
}
