import java.util.Scanner;

// 10810 공 바꾸기
public class BJ10813_ChangingBall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        int b_num1, b_num2;
        int temp;
        for (int i = 0; i < m; i++) {
            b_num1 = sc.nextInt();
            b_num2 = sc.nextInt();

            temp = basket[b_num1-1];
            basket[b_num1-1] = basket[b_num2-1];
            basket[b_num2-1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
