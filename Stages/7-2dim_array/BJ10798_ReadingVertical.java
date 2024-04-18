import java.util.Scanner;

public class BJ10798_ReadingVertical {
    public static void main(String[] args) {
        char[][] inputMat = new char[5][15];
        String temp;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                inputMat[i][j] = temp.charAt(j);
            }
        }
        sc.close();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (inputMat[j][i] != '\u0000')
                    System.out.print(inputMat[j][i]);
            }
        }
    }
}
