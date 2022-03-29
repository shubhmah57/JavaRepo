package JavaPrograms.Collections.ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class ReverseList extends ArrayList<Integer> {

//    List<String> list = Arrays.asList("A", "B", "C", "D");
    List<Integer> list = Arrays.asList(1,4,22,123);

//    Consumer<String> removeElement = s -> {
//        System.out.println(s + " " + list.size());
//        if (s != null && s.equals("A")) {
//            list.remove("D");
//        }
//    };

    @Override
    public Iterator<Integer> iterator() {

        final int startIndex = this.size() - 1;
        final List<Integer> list = this;
        return new Iterator<Integer>() {

            int currentIndex = startIndex;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Integer next() {
                Integer next = list.get(currentIndex);
                currentIndex--;
                return next;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (Integer s : this) {
            action.accept(s);
        }
    }

    public void iterateParallel() {
        list.forEach(System.out::print);
        System.out.print(" ");
        list.parallelStream().forEach(System.out::print);
    }

    public void iterateReverse() {
        List<Integer> myList = new ReverseList();
        myList.addAll(list);
        myList.forEach(System.out::print);
        System.out.print(" ");
        myList.stream().forEach(System.out::print);
    }

//    public void removeInCollectionForEach() {
//        list.forEach(removeElement);
//    }
//
//    public void removeInStreamForEach() {
//        list.stream().forEach(removeElement);
//    }

    public static void main(String[] argv) {

        ReverseList collectionForEach = new ReverseList();
//        collectionForEach.iterateParallel();
            collectionForEach.iterateReverse();
//        collectionForEach.removeInCollectionForEach();
//        collectionForEach.removeInStreamForEach();
    }
}