package JavaPrograms.Java8.StreamsPractice.Sorting;

import JavaPrograms.Model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NewMethodComparing {
    public static void main(String[] args) {
        List<JavaPrograms.Model.Employee> employeeList = new ArrayList<>();
        employeeList.add(new JavaPrograms.Model.Employee("Shubham", 27, "Senior Engineer"));
        employeeList.add(new JavaPrograms.Model.Employee("Rahul", 29, "Senior Engineer"));
        employeeList.add(new JavaPrograms.Model.Employee("Yogesh", 28, "Senior Engineer"));
        employeeList.add(new Employee("Rajiv", 37, "Software Development Manager"));

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getAge);


        employeeList.sort(Comparator.comparing(Employee::getAge));

        System.out.println(employeeList);
        Comparator<Employee> reversedComparator = employeeComparator.reversed();

        employeeList.sort(reversedComparator);

        System.out.println(employeeList);

        Employee employees =employeeList
                .stream()
                .min(Comparator.comparing(Employee::getAge))
                .orElse(null);
        System.out.println("Minimum :" + employees);
    }
}
