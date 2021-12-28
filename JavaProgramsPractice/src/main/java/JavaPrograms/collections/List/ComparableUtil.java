package JavaPrograms.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUtil implements  Comparable<ComparableUtil>{
    private int ranking;
    private String name;

    public ComparableUtil(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    private int age;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<ComparableUtil> footballTeam = new ArrayList<>();
        ComparableUtil ComparableAndComparator1 = new ComparableUtil(59, "Abhishek", 20);
        ComparableUtil ComparableAndComparator2 = new ComparableUtil(67, "Abhinav", 22);
        ComparableUtil ComparableAndComparator3 = new ComparableUtil(45, "ABhimanyu", 24);
        footballTeam.add(ComparableAndComparator1);
        footballTeam.add(ComparableAndComparator2);
        footballTeam.add(ComparableAndComparator3);
        Collections.sort(footballTeam);
        footballTeam.stream().forEach(x-> System.out.println(x.getName()));
    }
    @Override
    public int compareTo(ComparableUtil o) {
        /**
         * Your Own Sorting Order can be specified
         */
        return this.getName().compareTo(o.getName());
    }
}
