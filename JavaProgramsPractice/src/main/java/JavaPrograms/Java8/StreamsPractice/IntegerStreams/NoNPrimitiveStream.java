package JavaPrograms.Java8.StreamsPractice.IntegerStreams;

import JavaPrograms.Java8.StreamsPractice.ArthimeticOperations.ArithmeticUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoNPrimitiveStream {

    public static void main(String[] args) {
        Integer [] values = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> valuesList = Arrays.stream(values).filter(x-> x>5).collect(Collectors.toList());
        System.out.println("Values :" + valuesList);
        int sum  = Arrays.stream(values).filter(x-> x>2).map(x-> x*3).reduce(0, Integer::sum);
        System.out.println("The sum is:" + sum);

        Stream<Integer> integerStream = Arrays.stream(values);
        int total = integerStream.filter(x->x>2).map(x->x*3).reduce(0, ArithmeticUtils::add);
        int sum1  = integerStream.reduce(0, Integer::sum);
        System.out.println(sum1);
        System.out.println("The total is:" + total);


    }

}
