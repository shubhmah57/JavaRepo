package JavaPrograms.Java8.StreamsPractice.Sorting;

import JavaPrograms.Model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithoutComparable {



    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Shubham", 27, "Senior Engineer"));
        employeeList.add(new Employee("Rahul", 29, "Senior Engineer"));
        employeeList.add(new Employee("Yogesh", 28, "Senior Engineer"));
        employeeList.add(new Employee("Rajiv", 37, "Software Development Manager"));
        /** Using
         * Comparator
         */
        Comparator<Employee> employeeComparator = (e1, e2)->{
            return Integer.compare(e2.getAge(), e1.getAge());
        };
        employeeList.stream().sorted(employeeComparator).forEach(x-> System.out.println(x.getName()));
        System.out.println("------------Without Comparator its a lambda function-----------------");

        Collections.sort(employeeList,(e1, e2)->{
            return Integer.compare(e2.getAge(), e1.getAge());
        });
        employeeList.forEach(x-> System.out.println(x.getName()));
    }
}
