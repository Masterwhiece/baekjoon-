import java.util.Scanner;

// 25314 코딩은 체육과목 입니다
public class BJ25314_CodingIsPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int loop = N / 4;

        for(int i = 0; i < loop; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
