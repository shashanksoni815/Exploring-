public class largestof3 {
    public static void main(String[] args) {
        int a = 105;
        int b = 228;
        int c = 10;
        if(a>b && a>c){
            System.out.println("a is grater than b and c ");
        } else if (b>c) {
            System.out.println("b is grater than a and c");
        } else{
            System.out.println("c is greater than a and b");
        }
    }
}
