import java.util.Scanner;


public class BJ25206_YourGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String subject;
        double time;
        String grade;
        int cnt = 0;
        double totalSum = 0;
        for (int i = 0; i < 20; i++) {
            subject = sc.next();
            time = sc.nextDouble();
            grade = sc.next();

            if (grade.equals("P")) {
                continue;
            } else {
                cnt += time;
                switch (grade) {
                    case "A+":
                        totalSum += time * 4.5;
                        break;
                    case "A0":
                        totalSum += time * 4.0;
                        break;
                    case "B+":
                        totalSum += time * 3.5;
                        break;
                    case "B0":
                        totalSum += time * 3.0;
                        break;
                    case "C+":
                        totalSum += time * 2.5;
                        break;
                    case "C0":
                        totalSum += time * 2.0;
                        break;
                    case "D+":
                        totalSum += time * 1.5;
                        break;
                    case "D0":
                        totalSum += time * 1.0;
                        break;
                    case "F":
                        totalSum += time * 0;
                        break;
                    default:
                        System.out.println("something's worng");
                }
            }
        }
        System.out.println(totalSum / cnt);
        sc.close();
    }
}
