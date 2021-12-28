package JavaPrograms.Java8.StreamsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCalculation {
    public static void main(String[] args) {
        Character[] letters = {'a', 'b', 'b', 'c', 'c', 'c'};

        frequencyMap(Arrays.stream(letters));
    }

    private static void frequencyMap(Stream<Character> stream) {
        HashMap<Character, Long> maps = stream.collect(Collectors.groupingBy(Function.identity(),
                HashMap::new,
                Collectors.counting()));
    }
}
