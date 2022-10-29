import java.util.*;
 
public class PrintDuplicates {
    public static void printDuplicatesWithCount(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }

        // System.out.println(map);

        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            int val = (int)item.getValue();
            if(val > 1) {
                System.out.println(item.getKey() + ", " + val);
            }
        }
    }

    public static void main(String[] args) {
        printDuplicatesWithCount("racecar");
    }
}

