import java.util.*;

public class BJ1157_WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        sc.close();

        Map<Character, Integer> charIntMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (charIntMap.keySet().contains(ch)) {
                charIntMap.put(ch, charIntMap.get(ch) + 1);
            } else {
                charIntMap.put(ch, 1);
            }
        }

        int max = charIntMap.values().stream().max(Comparator.naturalOrder()).orElse(0);

        int cnt = 0;
        char result = ' ';
        for (Map.Entry<Character, Integer> entry : charIntMap.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();
            if (v == max) {
                cnt++;
                result = k;
            }
        }

        if (cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println(result);
        }

    }
}
