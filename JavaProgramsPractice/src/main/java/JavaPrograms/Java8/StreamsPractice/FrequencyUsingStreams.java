package JavaPrograms.Java8.StreamsPractice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyUsingStreams {
    public static void main(String[] args) {
        String str = "IamaSoftwareEngineer";

        Stream.of(str.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .map(e->e.getKey()+e.getValue()+"")
                .forEach(System.out::print);
    }
}
