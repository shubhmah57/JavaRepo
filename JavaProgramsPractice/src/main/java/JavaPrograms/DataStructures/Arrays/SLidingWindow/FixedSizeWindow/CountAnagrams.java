package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountAnagrams {
    public static void main(String[] args) {
        String a = "cbaebabacd";
        String b = "abc";
        char[] c = a.toCharArray();
        String d = "";
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int k = b.length();
        int i =0, j =0;
        int count =0, coun =0   ;
        for(char s : b.toCharArray()){
            map1.put(s, map1.getOrDefault(s,0)+1);
        }
        coun = map1.size();
        while (j<a.length()){
            //map2.put(c[j],map2.getOrDefault(c[j],0)+1);
            if(map1.containsKey(c[j])){
                map1.put(c[j],map1.get(c[j])-1);
                if(map1.get(c[j])==0) { //only when the one distinct letter out of the map becomes zero
                    coun = coun - 1;
                }
            }
            if(j-i+1==k){
               if(coun==0){
                   count++;
               }
                if(map1.containsKey(c[i])){
                    map1.put(c[i],map1.get(c[i])+1);
                    if(map1.get(c[i])>0){
                        coun++;
                    }
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
