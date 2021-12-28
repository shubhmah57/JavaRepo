package JavaPrograms.Java8.StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatList {
    public static void main(String[] args) {
        Integer [] a  = {1,3,4,5,6,8};
        Integer b[] = {7,8,9,9,9,10,11};
        List<Integer> p = Arrays.asList(a);
        List<Integer> k = Arrays.asList(b);
        List<Integer> collective = Stream.concat(p.stream(),k.stream()).collect(Collectors.toList());
        collective.stream().forEach(x-> System.out.println(x));
    }
}

