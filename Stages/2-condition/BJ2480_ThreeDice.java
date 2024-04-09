import java.util.*;

// 2480 주사위 세개
public class BJ2480_ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            mylist.add(sc.nextInt());
        }
        HashSet<Integer> myset = new HashSet<>(mylist);

        int reward = 0;

        // 1. 같은 눈 3개 나옴
        if (myset.size() == 1) {
            reward = mylist.get(0) * 1000 + 10000;
        } else if (myset.size() == 2) {
            Iterator<Integer> iter = myset.iterator();
            while (iter.hasNext()) {
                mylist.remove(iter.next());
            }
            reward = 1000 + 100 * mylist.get(0);
        } else if (myset.size() == 3) {
            Collections.sort(mylist, Comparator.reverseOrder());
            reward = mylist.get(0) * 100;
        }
//        System.out.println("reward: " + reward);
        System.out.println(reward);
    }

}
