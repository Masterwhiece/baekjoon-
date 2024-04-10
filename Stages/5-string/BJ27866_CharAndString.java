import java.util.Scanner;

// 27866 문자와 문자열
public class BJ27866_CharAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = sc.nextInt();
        sc.close();
        System.out.println(str.charAt(idx-1));
    }
}
