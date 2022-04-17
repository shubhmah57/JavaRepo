package JavaPrograms.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int [] a = {1,2,2,1};
        int []b = {2,2};
        Set<Integer> output = new HashSet<>();
        Set<Integer> valuesSet = new HashSet<>();

        for(int i: a){
            valuesSet.add(i);
        }
        for(int i: b){
            if(valuesSet.contains(i)){
                 output.add(i);
            }
        }
        output.forEach(System.out::println);
    }
}
