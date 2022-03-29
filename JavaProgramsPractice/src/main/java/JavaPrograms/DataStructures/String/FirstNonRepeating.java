package JavaPrograms.DataStructures.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String value = "GeeksforGeeks";
        Map<Character, Integer> countsMap = new LinkedHashMap<>();
        Stream.of(value.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .ifPresent(x -> System.out.println("NON Repeating Character:"  + x.getKey()));
//         for(char c: value.toCharArray()){
//             if(countsMap.containsKey(c)){
//                 countsMap.put(c, countsMap.get(c)+1);
//             }
//             else {
//                 countsMap.put(c,1);
//             }
//         }
//                            countsMap
//                            .entrySet()
//                            .stream()
//                            .filter(x->x.getValue()==1)
//                            .findFirst()
//                            .ifPresent(ch-> System.out.println(ch.getKey()));
//    }
    }
}
