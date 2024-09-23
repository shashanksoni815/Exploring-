import java.util.*;

public class starting4 {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      float avg = (a + b + c) + (a + b + c) * 0.18f;
      System.out.println(avg);
  }
}