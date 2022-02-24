package JavaPrograms.Collections.HashingBasedDS;

import java.util.HashSet;

public class ConstantHashCodeHashSet {

    int  b;
    String a;

    ConstantHashCodeHashSet(String a , int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConstantHashCodeHashSet other = (ConstantHashCodeHashSet) obj;
        if (a == null) {
            if (other.a != null)
                return false;
        } else if (!a.equals(other.a))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 21;
    }

    public static void main(String[] args) {
        HashSet<ConstantHashCodeHashSet> h = new HashSet<>();
        ConstantHashCodeHashSet j =new ConstantHashCodeHashSet("a", 12);
        System.out.println(j.hashCode());
        h.add(j);
        ConstantHashCodeHashSet j1 =new ConstantHashCodeHashSet("b", 12);
        System.out.println(j1.hashCode());
        h.add(j1);
        ConstantHashCodeHashSet j2 =new ConstantHashCodeHashSet("a", 12);
        System.out.println(j2.hashCode());
        h.add(j2);
        ConstantHashCodeHashSet constantHashCodeHashSet1 = new ConstantHashCodeHashSet("a", 12);
        System.out.println(constantHashCodeHashSet1.hashCode());
        h.remove(constantHashCodeHashSet1);
        System.out.println(h.size());
    }
}

