package JavaPrograms.collections;

import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.stream.Collectors;

public class Interview2 {
    public static void main(String[] args) {
        String s []= {"eat", "tan", "ate", "nat", "tea"};
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < s.length; i++){
            char a[] = s[i].toCharArray();
             Arrays.sort(a);
             stringList.add(new String(a));
        }
//        stringList.forEach(System.out::println);
        Map<String, Integer> anagramsMap = new HashMap<>();
        for(int i =0 ;i < stringList.size(); i++){

            for(int j =i+1; j < stringList.size(); j++){
                if(stringList.get(i).equals(stringList.get(j))){
                    System.out.print(stringList.get(i) +  " ");
                }
            }
            System.out.println();
        }
    }
}
