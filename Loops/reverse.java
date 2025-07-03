// package Loops;

// public class reverse {
//     public static void main(String[] args) {
//         int n = 59682;
//         int lastdigit = 0;
//         while (n > 0) {
//             lastdigit = n%10;
//             n = n/10;
//             System.out.print(lastdigit);
//         } 

//         int rev = 0;
//         while (n > 0) {
//             lastdigit = n%10;
//             rev = (rev * 10) + lastdigit;
//             n /= 10;
//         } 
//         System.out.println(rev);
//     }
// }

import java.util.Scanner;

// import Loops.forLoop;

public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int s = n % 10;
            rev = (rev * 10) + s;
        }
        System.out.println(rev);
        sc.close();
    }
}