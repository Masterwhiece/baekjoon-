import java.util.Scanner;

public class BJ3003_Chess {
    public static void main(String[] args) {
        int[] chessArr = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print((chessArr[i] - sc.nextInt()) + " ");
        }
    }
}
