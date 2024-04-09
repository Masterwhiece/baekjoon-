import java.util.Scanner;

// 18108 1998년생인 내가 태국에서는 2541년생?!
public class BJ18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(y-543);
        sc.close();
    }
}
