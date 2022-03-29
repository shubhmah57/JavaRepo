package JavaPrograms.Collections.ForEach;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReversedArrayList extends ArrayList<Integer>{
    List<Integer> list = Arrays.asList(1,4,5,67);
    @NotNull
    @Override
    public Iterator<Integer> iterator() {

        int startIndex = this.size()-1;
        List<Integer> list = this;
        Iterator<Integer> it = new Iterator<Integer>() {
            int currentIndex = startIndex;
            @Override
            public boolean hasNext() {
                return currentIndex>=0;
            }

            @Override
            public Integer next() {
                Integer next = list.get(currentIndex);
                currentIndex--;
                return next;
            }

            @Override
            public void remove() {
                throw  new UnsupportedOperationException();
            }
        };

        return it;
    }

    public  void iterateReversed(){
        List<Integer> myList = new ReversedArrayList();
        myList.addAll(list);
        myList.forEach(System.out::println);
        System.out.println();
        myList.stream().forEach(System.out::println);
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for(Integer s : this){
            action.accept(s);
        }
    }

    Consumer<Integer> removeElement = (s)->{
        System.out.println(s);
      if(s!=null && s.equals(4))  {
          list.remove((4));
      }
    };

    public static void main(String[] args) {
        ReversedArrayList reversedArrayList = new ReversedArrayList();
        reversedArrayList.iterateReversed();
        reversedArrayList.removeElement();
    }

    private void removeElement() {

        //list.forEach(removeElement);
        System.out.println();
        list.stream().forEach(removeElement);

    }
}

