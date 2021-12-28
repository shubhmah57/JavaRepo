package JavaPrograms.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIstPractice {
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add(90);
        ls.add(46);
        ls.add(75);
        ls.add(35);
        ls.add(50);
        System.out.println(Collections.binarySearch(ls, 35, Collections.reverseOrder()));
    }
}
