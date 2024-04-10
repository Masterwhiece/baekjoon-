import java.util.Scanner;

public class BJ2444_Star7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // n: 5
        // i: 1~5
        // 별의 개수: 1 3 5 7 9 (2*i-1)
        // 공백 개수: 4 3 2 1 0 (n-i)

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // i: 4~1
        // 공백 개수: 1 2 3 4 (n-i)
        // 별의 개수: 7 5 3 1 (2*i-1)

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
