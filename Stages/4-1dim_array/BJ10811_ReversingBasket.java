import java.util.Arrays;
import java.util.Scanner;

public class BJ10811_ReversingBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = i + 1;
        }

        int start, end;
        for (int i = 0; i < m; i++) {
            start = sc.nextInt() - 1;
            end = sc.nextInt() - 1;
            int len = end - start + 1;

            int[] newArr = new int[len];
            for (int j = 0; j < len; j++) {
                newArr[j] = intArr[end - j];
            }
//            for (int j = 0; j < newArr.length; j++) {
//                System.out.print(newArr[j] + " ");
//            }
//            System.out.println();


            for (int j = 0; j < len; j++) {
                intArr[start + j] = newArr[j];
            }
//            for (int j = 0; j < n; j++) {
//                System.out.print(intArr[j] + " ");
//            }
//            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(intArr[i] + " ");
        }
        sc.close();
    }
}
