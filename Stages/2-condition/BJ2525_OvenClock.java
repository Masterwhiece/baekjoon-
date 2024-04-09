import java.util.Scanner;

// 2525 오븐 시계
public class BJ2525_OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        int cook_time;
        h = sc.nextInt();
        m = sc.nextInt();
        cook_time = sc.nextInt();
        sc.close();

        int sum_m = m + cook_time;
        int temp_h = sum_m / 60;
        int temp_m = sum_m % 60;

        h = h + temp_h;
        if (h >= 24) {
            h = h % 24;
        }
        m = temp_m;

        System.out.println(h + " " + m);

    }
}
