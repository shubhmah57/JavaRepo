package JavaPrograms.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatennCollections {
    /**
     * Need to use flatMap over here
     * @param args
     */
    public static void main(String[] args) {
        Integer [] a = {1,3,4,5,6,7,8};
        List<Integer> integers = Arrays.asList(a);
        Integer [] b = {6,7,7,21,1,22};
        List<Integer> integerList = Arrays.asList(b);
        List<List<Integer>> listArrayList= new ArrayList<>();
        listArrayList.add(integerList);
        listArrayList.add(integers);
        listArrayList.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
