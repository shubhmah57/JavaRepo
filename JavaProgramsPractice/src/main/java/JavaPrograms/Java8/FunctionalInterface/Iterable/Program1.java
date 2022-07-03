package JavaPrograms.Java8.FunctionalInterface.Iterable;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        Consumer<Integer> consumer = (x)->{
            System.out.print(x+" ");
        };
        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(consumer);



    }
}
