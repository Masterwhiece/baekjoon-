import java.util.Scanner;

public class BJ10988_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        sc.close();

        StringBuffer strBuf = new StringBuffer(inputStr);
        String reveredStr = strBuf.reverse().toString();
        if (reveredStr.equals(inputStr)) {
            System.out.println("1");
        } else
            System.out.println("0");
    }
}
