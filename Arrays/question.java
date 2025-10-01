import java.util.*;

public class question {

    public static void median(int question[], int arr[]) {
        int num[] = new int[question.length + arr.length];

        System.arraycopy(question, 0, num, 0, question.length);
        System.arraycopy(arr, 0, num, question.length, arr.length);
        
        int idx = num.length;
        // for (int i = 0; i < num.length; i++) {
        //     System.out.print(num[i] + " ");
            if (num.length % 2 == 0) {
                double median = (num[idx / 2] + num[ (idx/2) - 1] );
                System.out.println(median/2);
            } else {
                int median = num[idx / 2] ;
                System.out.println(median/2);
                
            }
        // }
    }

    public static void main(String[] args) {
        int question[] = {1, 2};
        int arr[] = {3, 4};
        median(question, arr);
        // System.out.println(question[0]);
    }
}
