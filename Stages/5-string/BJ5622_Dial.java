import java.util.HashMap;
import java.util.Scanner;

public class BJ5622_Dial {
    public static void main(String[] args) {
        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('A', 2);
        myMap.put('B', 2);
        myMap.put('C', 2);

        myMap.put('D', 3);
        myMap.put('E', 3);
        myMap.put('F', 3);

        myMap.put('G', 4);
        myMap.put('H', 4);
        myMap.put('I', 4);

        myMap.put('J', 5);
        myMap.put('K', 5);
        myMap.put('L', 5);

        myMap.put('M', 6);
        myMap.put('N', 6);
        myMap.put('O', 6);

        myMap.put('P', 7);
        myMap.put('Q', 7);
        myMap.put('R', 7);
        myMap.put('S', 7);

        myMap.put('T', 8);
        myMap.put('U', 8);
        myMap.put('V', 8);

        myMap.put('W', 9);
        myMap.put('X', 9);
        myMap.put('Y', 9);
        myMap.put('Z', 9);

//        System.out.println(myMap.toString());

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int time = 0;
        for (int i = 0; i < input.length(); i++) {
            time += myMap.get(input.charAt(i)) + 1;
        }
        System.out.println(time);
    }
}
