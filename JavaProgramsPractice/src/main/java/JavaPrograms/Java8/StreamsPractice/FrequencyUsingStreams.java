package JavaPrograms.Java8.StreamsPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
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


        System.out.println();
        Map<String,String> map = new HashMap<String,String>();

        map.put("AUD","06/01/2022");

        map.put("USD","16/11/2025");

        map.put("CHF","13/03/2022");

        map.entrySet().stream()
                .filter(x->LocalDate.parse(x.getValue(),DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        .toEpochDay()>
                        LocalDate.now().toEpochDay())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
