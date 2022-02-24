package JavaPrograms.Java8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = new MySupplier();
        integerSupplier.get();
    }
}

class MySupplier implements Supplier<Integer>{

    @Override
    public Integer get() {
        return 1;
    }
}
