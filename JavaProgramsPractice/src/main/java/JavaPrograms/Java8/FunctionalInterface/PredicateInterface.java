package JavaPrograms.Java8.FunctionalInterface;

import JavaPrograms.Java8.FunctionalInterface.Model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {
       List<Person> people = Arrays.asList(
                new Person("Shubham", "27", "Male"),
               new Person("Rahul", "28", "Male"),
               new Person("Vani", "27", "FeMale"),
               new Person("Priya", "29", "FeMale"),
               new Person("Ketki", "23", "FeMale")
       );

       Predicate<Person> per = new MyPredicate();
       List<Person> personList =people
                            .stream()
                            .filter(per::test).
                            collect(Collectors.toList());
        System.out.println(personList.size());
    }
}


  class MyPredicate implements Predicate<Person>{


    @Override
    public boolean test(Person person) {
        return person.getGender().equals("Male");
    }
}
