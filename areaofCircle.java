import java.util.*;

public class areaofCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int sq = r*r;
        float pi = 3.14f;
        System.out.println((float)sq*pi);
        sc.close();
    }
}
