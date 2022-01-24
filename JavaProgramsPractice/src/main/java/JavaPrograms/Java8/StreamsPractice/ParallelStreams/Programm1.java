package JavaPrograms.Java8.StreamsPractice.ParallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programm1 {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("ee", "dd", "mm");
        str.stream().parallel().forEachOrdered(System.out::println);
        List<String> ght =
                str.stream().parallel().filter(x->x.contains("e")).collect(Collectors.toList());
        System.out.println(ght);

        List<Integer> stee = Arrays.asList(1,2,35,1);
        System.out.println(stee.stream().map(x->x+5).collect(Collectors.toList()));
        System.out.println(stee.parallelStream().map(x->x+5).collect(Collectors.toList()));

    }
}
