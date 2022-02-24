package JavaPrograms.Java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new MyConsumer();
        consumer.accept(9);
    }
}

class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}