import java.util.Scanner;

// 5597 과제 안 내신분...?
public class BJ5597_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myarr = new int[30];
        for (int i = 0; i < 28; i++) {
            myarr[sc.nextInt()-1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if (myarr[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
