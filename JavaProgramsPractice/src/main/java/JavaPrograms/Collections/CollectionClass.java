package JavaPrograms.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        collection.forEach(System.out::print);
        System.out.println();
        collection.stream().forEach(System.out::print);
    }
}
