package JavaPrograms.collections.HashingBasedDS;

import java.util.HashMap;
import java.util.HashSet;

public class ConstantHasHCode {
    public static void main(String[] args) {
        /**
         * The concept of HashMap Revolves around an acronym HE (First HashCode Then Equals)
         * in this case a constant HashCode is there
         * Now afterwards from the constant hashcode it will check whether the key is equal or not
         * if the key is equal then it would replace the earlier value present at that index
         * otherwise it would add it to the link list which now days after Java 1.8 is Binary Tree
         * as of its search efficiency.
         */
        HashMap<Integer, Integer > stringStringHashMap = new HashMap<>();
        stringStringHashMap.put(1,1);
        stringStringHashMap.put(2,2) ;
        stringStringHashMap.put(3,3) ;
        stringStringHashMap.put(4,4) ;
        stringStringHashMap.forEach((p, d) -> System.out.println(p + " : " + d));

        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(456);
        hashSet.stream().forEach(x-> System.out.println(x));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 42;
    }
}

