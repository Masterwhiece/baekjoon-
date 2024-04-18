import java.util.Scanner;
import java.util.ArrayList;

public class BJ2941_CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        ArrayList<String> alphabetDict = new ArrayList<>();
        alphabetDict.add("c=");
        alphabetDict.add("c-");
        alphabetDict.add("dz=");
        alphabetDict.add("d-");
        alphabetDict.add("lj");
        alphabetDict.add("nj");
        alphabetDict.add("s=");
        alphabetDict.add("z=");

        int idx = 0;
        int stepCnt = 0;
        int totalCnt = 0;
        int charCnt = 0;
        int dzNum = 0;
        int zNum = 0;
        String saveInput = input;
        for (String str : alphabetDict) {
//            System.out.println(str);
            while (input.contains(str)) {
                stepCnt++;
                idx = input.indexOf(str, idx);
                input = input.substring(idx + str.length());
                idx = 0;
            }

            if (str == ("dz=")) {
                dzNum = stepCnt;
//                System.out.println("dzNum: " + dzNum);
            }
            if (str == "z=") {
                zNum = stepCnt - dzNum;
//                System.out.println("zNum: " + zNum);
                totalCnt += zNum;
                for (int i = 0; i < zNum; i++) {
                    charCnt += str.length();
                }
            } else {
                totalCnt += stepCnt;
                for (int i = 0; i < stepCnt; i++) {
                    charCnt += str.length();
                }
            }
//            System.out.println(stepCnt + " " + charCnt + " " + totalCnt);

            input = saveInput;
            stepCnt = 0;
        }
        int result = saveInput.length() - charCnt + totalCnt;
        System.out.println(result);
    }
}
