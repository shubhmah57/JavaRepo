package JavaPrograms.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationsPractice {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(5);
        ls.add(7);
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        int [] a = {5, 0, 3, 0, 1, 2, 0, 0, 6};
        for(int i = 0 ; i < a.length; i++){

        }
    }

}
