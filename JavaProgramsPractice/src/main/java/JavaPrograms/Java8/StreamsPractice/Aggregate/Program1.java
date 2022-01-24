package JavaPrograms.Java8.StreamsPractice.Aggregate;

import JavaPrograms.Java8.StreamsPractice.Model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1 {
    public static void main(String[] args) {

        List<Integer> integerList = Stream.of(1,3,4,5,6,1,5,4,4,4,5,5,6,4,2,11)
                .mapToInt(i->i)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integerList);

       Long count = Stream.of(1,3,4,5,6,1,5,4,4,4,5,5,6,4,2,11)
                .mapToInt(i->i).count();
        System.out.println(count);

        List<Person> personList = Arrays.asList(new Person("Shubham", 5000, "MALE"),
                new Person("Rahul", 6000, "MALE"),
                new Person("John", 8000, "MALE"),
                new Person("Ahilya", 4000, "FEMALE"),
                new Person("Riya", 8000, "FEMALE"));

       Double averageSalary = personList.stream()
                .filter(x->x.getGender().equals("MALE"))
                .map(Person::getSalary)
                .mapToInt(y->y)
                .average()
                .getAsDouble();
        System.out.println("Average Salary" + averageSalary);

     Integer maxSalary =  personList.stream().
               filter(x->x.getGender().equals("FEMALE"))
                       .map(Person::getSalary)
                               .reduce(Integer::max).get();
        System.out.println("MAX Salary" + maxSalary);

     int sum = personList.stream()
                     .filter(x->x.getGender().equals("MALE"))
                        .map(Person::getSalary)
                                .reduce(0, Integer::sum);
        System.out.println("SUm Salary" + sum);

    }
}
