package JavaPrograms.Java8.StreamsPractice;

import JavaPrograms.Java8.StreamsPractice.Model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SalarySumission {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Shubham", 9000, "Male"),
                new Person("Rahul", 3000,"Male"),
                new Person("Vani", 3200, "Female"));
        personList.stream().filter(x->x.getGender()
                        .equals("Male"))
                        .map(Person::getSalary)
                .reduce(0,(a, b)-> a+b);


    }

}
