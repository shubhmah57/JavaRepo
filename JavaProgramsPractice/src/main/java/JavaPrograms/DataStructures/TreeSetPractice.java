package JavaPrograms.DataStructures;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice implements Comparable{

    @Override
    public String toString() {
        return "1";
    }

    public static void main(String[] args) {
        TreeSet<TreeSetPractice> set = new TreeSet<TreeSetPractice>();
        set.add(new TreeSetPractice());
        set.add(new TreeSetPractice());
        Iterator<TreeSetPractice> it =  set.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
        }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
