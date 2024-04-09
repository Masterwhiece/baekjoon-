import java.util.Scanner;

public class BJ10810_PuttingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int start, end, num;
        int[] basket = new int[n];

        for (int i = 0; i < m; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            num = sc.nextInt();

            for (int k = start - 1; k < end; k++) {
                basket[k] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
