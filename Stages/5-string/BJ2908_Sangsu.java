import java.util.Scanner;

public class BJ2908_Sangsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        sc.close();

        StringBuffer strBuf1 = new StringBuffer(strArr[0]);
        StringBuffer strBuf2 = new StringBuffer(strArr[1]);
        int n1 = Integer.parseInt(strBuf1.reverse().toString());
        int n2 = Integer.parseInt(strBuf2.reverse().toString());

        int result = (n1 > n2) ? n1 : n2;
        System.out.println(result);
    }
}
