import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// 5597 과제 안 내신분...?
public class BJ5597_Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> myset = new HashSet<Integer>();
        for (int i = 1; i < 31; i++) {
            myset.add(i);
        }
        for (int i = 0; i < 28; i++) {
            myset.remove(sc.nextInt());
        }
//		while(sc.hasNext()) {
//			myset.remove(sc.nextInt());
//		}


        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        sc.close();
    }
}
