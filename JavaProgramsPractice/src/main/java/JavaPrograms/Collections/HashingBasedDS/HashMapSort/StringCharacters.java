package JavaPrograms.Collections.HashingBasedDS.HashMapSort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sorted HashMap on the base of KEys
 */
public class StringCharacters {
    public static void main(String[] args) {
        String s = "hellothere";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(freqMap.containsKey(s.charAt(i))){
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i))+1);
            }
            else {
                freqMap.put(s.charAt(i),1);
            }
        }
        System.out.println(freqMap);
        //without use of streams
        List<Map.Entry<Character,Integer>> list =freqMap.entrySet().stream().collect(Collectors.toList());
        Comparator<Map.Entry<Character,Integer>> comp = (Map.Entry<Character,Integer> e1, Map.Entry<Character,Integer> e2)->{
            if(e1.getKey().toString().compareTo(e2.getKey().toString()) > 1){
                return -1;
            }
            else if (e1.getKey().toString().compareTo(e2.getKey().toString()) <1){
                return  1;
            }
            else{
                return  0;
            }
        };
        Collections.sort(list,comp);
        list.stream().forEach(x-> System.out.println(x));

    }
}
