import java.util.Scanner;

public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int ereaser = sc.nextInt();

        int total = pencil + pen + ereaser;

        float price = ((total*0.18f) + total);
        System.out.println(price);
    }
}
