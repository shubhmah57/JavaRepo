package JavaPrograms.DataStructures.String;

import java.util.HashMap;
import java.util.Map;

public class Isometric {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        String d = "";
        Map<Character, Integer> charToIndex_s = new HashMap<>();
        Map<Character, Integer> charToIndex_t = new HashMap<>();

        for (Integer i = 0; i < s.length(); ++i){
            if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
            {
                System.out.println("not");
                break;
            }

        }
        System.out.println("Yes");
    }
}
