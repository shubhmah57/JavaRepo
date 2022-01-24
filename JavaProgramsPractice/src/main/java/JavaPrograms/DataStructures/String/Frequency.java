package JavaPrograms.DataStructures.String;

import java.util.TreeMap;

public class Frequency {


    public static void main(String[] args) {
        String str = "qwertyuioplkjhgfdsazxcvbnmmnbvcxzasdfghjklpoiuytrewq";
        char[] ch = str.toCharArray();
        TreeMap<Character, Integer> maps = new TreeMap<Character, Integer>();

        for (char cha : ch) {
            if (maps.containsKey(cha)) {
                maps.put(cha, maps.get(cha) + 1);
            } else {
                maps.put(cha, 1);
            }
        }
        System.out.println(maps);
    }
}
