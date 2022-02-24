package JavaPrograms.Collections.HashingBasedDS;



import JavaPrograms.Collections.HashingBasedDS.POJOs.Country;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(3);
        sets.add(4);
        sets.add(5);

        sets.stream().forEach(x-> System.out.println(x));

        HashSet countrySet=new HashSet();
        Country india1=new Country();
        india1.setName("India");

        Country india2=new Country();
        india2.setName("England");

        countrySet.add(india1);
        countrySet.add(india2);

        System.out.println("size of nameSet="+countrySet.size());
        System.out.println(countrySet);
    }
}
