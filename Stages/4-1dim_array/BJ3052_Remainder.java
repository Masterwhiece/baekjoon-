import java.util.HashSet;
import java.util.Scanner;

// 3052 나머지
public class BJ3052_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> mySet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            mySet.add(sc.nextInt() % 42);
        }
        System.out.println(mySet.size());
        sc.close();
    }
}
