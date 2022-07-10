import java.util.*;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        Map<Character, Integer> occurs1 = new TreeMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            occurs1.put(i, 0);
        }

        Map<Character, Integer> occurs2 = new TreeMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            occurs2.put(i, 0);
        }

        for (char i : ransomNote.toCharArray()) {
            int x = occurs1.get(i) + 1;
            occurs1.put(i, x);
        }

        for (char i : magazine.toCharArray()) {
            int x = occurs2.get(i) + 1;
            occurs2.put(i, x);
        }
        boolean ans = true;
        for (char i = 'a'; i <= 'z'; i++) {
            if (occurs1.get(i) > occurs2.get(i)) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(occurs1);
        System.out.println(occurs2);
    }
}
        /*
        // ransomNote
        List<Character> toChars = ransomNote.chars().mapToObj(e -> (char) e).toList();
        Set<Character> uniques = new HashSet<>(toChars);
        Map<Character, Integer> occurs = new TreeMap<>();
        for (Character i : uniques) occurs.put(i, 0);

        // magazine
        List<Character> toChars1 = magazine.chars().mapToObj(e -> (char) e).toList();
        Set<Character> uniques1 = new HashSet<>(toChars1);
        Map<Character, Integer> occurs1 = new TreeMap<>();
        for (Character i : uniques1) occurs1.put(i, 0);

        for (Character i : toChars) {
            int x = occurs.get(i) + 1;
            occurs.put(i, x);
        }
        for (Character i : toChars1) {
            int x = occurs1.get(i) + 1;
            occurs1.put(i, x);
        }
        boolean result = true;
        for (Character i : toChars1) {
            if (occurs.get(i) > occurs1.get(i)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
        */
