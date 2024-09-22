import java.util.*;
// Area of circle
public class circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = (2 * r);
        float area = (float)(d * 3.14);
        System.out.println(area);
    }
}