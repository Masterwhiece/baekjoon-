import java.util.HashSet;
import java.util.Scanner;

public class BJ1316_GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strArr = new String[n];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.nextLine();
        }
        sc.close();

        HashSet<Character> charSet = new HashSet<>();
        boolean isGroupWord = true;
        String tempStr;
        char tempChar;
        char prevChar = '-';
        int cnt = 0;

        for (String s : strArr) {
            tempStr = s;
            for (int j = 0; j < tempStr.length(); j++) {
                tempChar = tempStr.charAt(j);
                if (charSet.contains(tempChar)) {
                    if (tempChar != prevChar) {
                        isGroupWord = false;
                    }
                } else {
                    charSet.add(tempChar);
                }
                prevChar = tempChar;
            }
            charSet.clear();
            if (isGroupWord) {
                cnt++;
            }
            isGroupWord = true;
        }
        System.out.println(cnt);
    }
}
