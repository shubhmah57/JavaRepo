package JavaPrograms.Java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function function = new MyFunction();

        Function<Integer,Integer> function1 = (a)->{
            return a+7;
        };

        System.out.println( function.apply(4));
        Integer f = function1.apply(5);
        System.out.println(f);


    }
}

class MyFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer aLong) {
        return aLong+3;
    }
}
