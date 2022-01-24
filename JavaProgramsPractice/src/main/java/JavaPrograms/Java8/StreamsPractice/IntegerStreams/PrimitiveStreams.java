package JavaPrograms.Java8.StreamsPractice.IntegerStreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        //Find the sum
        System.out.println("The sum is: "  +Arrays.stream(numbers).filter(x-> x >2).map(z-> z * 3).sum());
        int sum  = Arrays.stream(numbers).sum();

        System.out.println("The sum is" + sum);

        int sum1 = Arrays.stream(numbers).filter(x-> x> 3).sum();
        System.out.println(sum1);

        // Find the sorted order
        Arrays.stream(numbers).sorted().forEach(System.out::print);

        OptionalDouble average  = Arrays.stream(numbers).average();
        System.out.println();
        System.out.println( "The average " + average);

        System.out.println("The range: " + IntStream.range(1,6).average().getAsDouble());

        int [] numbersArray = {8,5,3,4,5,6,7,8,8,1,6};

        System.out.println("Distinct Values:");

        Arrays.stream(numbersArray).distinct().sorted().forEach(System.out::print);

        List<Integer> integerLis  = Arrays.stream(numbersArray).sorted()
                                    .boxed().collect(Collectors.toList());
        for(int i : integerLis){
            System.out.println("Values:" + i);
        }
    }
}
