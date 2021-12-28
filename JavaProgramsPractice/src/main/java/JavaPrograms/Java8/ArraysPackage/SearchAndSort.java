package JavaPrograms.Java8.ArraysPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchAndSort {

    public static void main(String[] args) {
        Integer[] array = IntStream.of(1,5).boxed().toArray(Integer[]::new);
        Arrays.binarySearch(array, 2);

        String[] strings =  {"1", "5", "8", "9", "hello"};
        List<String> arraysList  = Arrays.asList(strings);
        Integer [] a = {1,5,6,7};
//        Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> dd = Arrays.asList(a);
        for (String c: arraysList){
            System.out.println("Values:" + c);
        }



    }
}
