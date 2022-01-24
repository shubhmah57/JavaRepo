package JavaPrograms.DataStructures.String;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {

        String s []= {"eat", "tan", "ate", "nat", "tea"};
        Map<String, List<String>> stringListMap = new HashMap<>();
        List<List<String>> anagramsList= new ArrayList<>();
        for(int i = 0 ;  i< s.length; i++){
            char []c = s[i].toCharArray();
            Arrays.sort(c);
            String d = new String(c);
            if(!stringListMap.containsKey(d)){

                List<String> stringList = new ArrayList<>();
                stringList.add(s[i]);
                stringListMap.put(d, stringList);
            }
            else{
                List<String> stringList = stringListMap.get(d);
                stringList.add(s[i]);
                stringListMap.put(d,stringList);
            }
        }
        for(Map.Entry<String, List<String>> maps: stringListMap.entrySet()){
            anagramsList.add(maps.getValue());
        }

        anagramsList.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(x-> System.out.print(x +  " "));
    }

}
