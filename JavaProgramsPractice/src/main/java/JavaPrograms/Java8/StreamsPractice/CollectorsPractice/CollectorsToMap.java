package JavaPrograms.Java8.StreamsPractice.CollectorsPractice;

import JavaPrograms.Model.Employee;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {
    public static void main(String[] args) {
        Map<String,Integer> map= Stream.of(new Employee("Shubham",27,"SD"),
                new Employee("Rahul",28,"SSD"),
                new Employee("Karan",29,"SDE"))
                .filter(x->x.getAge()>28)
                .collect(Collectors.toMap(Employee::getName,Employee::getAge));
        System.out.println(map);
    }
}
