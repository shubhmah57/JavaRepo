package JavaPrograms.collections.HashingBasedDS;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EntrySetPractice {


    public static <T> void main(String[] args) {
       Map<String, String> maps = new HashMap<>();
        maps.put("1", "2");
        maps.put("2", "3");
        maps.put("3", "2");

        Set<Map.Entry<String, String>> entrySet  = maps.entrySet();

        Set<T> set = new HashSet<T>();

    }
}



