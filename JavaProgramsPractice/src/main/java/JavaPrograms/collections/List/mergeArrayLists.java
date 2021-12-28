package JavaPrograms.collections.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeArrayLists {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("A");
        listA.add("V");
        listA.add("F");
        listA.add("A");
        List<String> listB = new ArrayList<>();
        listB.add("G");
        listB.add("H");
        listB.add("Q");
        listB.add("R");
        listB.add("A");
        Stream.concat(listA.stream(), listB.stream()).distinct().collect(Collectors.toList());
        List<String> sorted = Stream.concat(listA.stream(), listB.stream()).distinct().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}
