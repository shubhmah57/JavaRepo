package JavaPrograms.collections.List;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);

       // list.stream().forEach(x-> System.out.println(x));
        /*TO check the distinct elements using streams*/
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        newList.stream().forEach(x-> System.out.println(x));

        Collections.reverse(list);

    }

}
