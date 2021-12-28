package JavaPrograms.Java8.StreamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListPractice {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);

        List<Integer> even = numbers.stream()
                .map(s -> Integer.valueOf(s))
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numbers.stream().map(s->Integer.valueOf(s)).count());
        List<String> items = new ArrayList<>();
        items.add("Shubham");
        items.add("Shivani");
        items.add("Rahul");
        items.add("Vani");
        System.out.println(items.stream().filter(x->x.startsWith("S")).count());
    }
}
