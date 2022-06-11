package JavaPrograms.DataStructures.Arrays.SLidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountAnagrams {
    public static void main(String[] args) {
        String a = "forxxoyfxdofr";
        String b = "for";
        char[] c = a.toCharArray();
        String d = "";
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int k = b.length();
        int i =0, j =0;
        int count =0;
        for(char s : b.toCharArray()){
            map1.put(s, map1.getOrDefault(s,0)+1);
        }
        while (j<a.length()){
            //map2.put(c[j],map2.getOrDefault(c[j],0)+1);
            if(map1.containsKey(c[j])){
                map1.put(c[j],map1.get(c[j])-1);
            }
            if(j-i+1==k){
                if(checkAnagram(map1,map2)){
                    count++;
                }
                if(map2.get(c[i])>0){
                    map2.put(c[i],map2.get(c[i])-1);
                }
                i++;
            }
            j++;
        }
        System.out.println("The count at:" + count);
    }

    private static boolean checkAnagram(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for(char c : map1.keySet()){
            if(!Objects.equals(map1.get(c), map2.get(c))){
                return  false;
            }
        }

        return true;
    }
}
