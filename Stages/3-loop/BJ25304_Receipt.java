import java.util.Scanner;

public class BJ25304_Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();


        int sum = 0;
        int price, num;
        for (int i = 0; i < n; i++) {
            price = sc.nextInt();
            num = sc.nextInt();
            sum += price * num;
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
