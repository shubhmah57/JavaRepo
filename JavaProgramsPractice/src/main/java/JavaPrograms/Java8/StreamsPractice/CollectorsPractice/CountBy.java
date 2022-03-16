package JavaPrograms.Java8.StreamsPractice.CollectorsPractice;

import JavaPrograms.Java8.StreamsPractice.Model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountBy {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("phagwara", "Palahi Road"),
                new Employee("phagwara", "Palahi Road"),
                new Employee("jalandhar", "Vijay Nagar"),
                new Employee("jalandhar", "Kapurthala Chowk")
        );

        Map<String, Long> maps = employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getCity,
                                Collectors.counting()));
        System.out.println(maps);

        List<Employee> employees = Arrays.asList(new Employee("phagwara", "Palahi Road",1000.0, "Male"),
                new Employee("phagwara", "Palahi Road",1000.0, "Male"),
                new Employee("Jalandhar", "Palahi Road",1000.0, "Female"),
                new Employee("Ludhiana", "Palahi Road",1000.0, "Female"),
                new Employee("phagwara", "Palahi Road",1000.0, "Male"));

        Map<String, Long> countMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countMap);
    }

}
