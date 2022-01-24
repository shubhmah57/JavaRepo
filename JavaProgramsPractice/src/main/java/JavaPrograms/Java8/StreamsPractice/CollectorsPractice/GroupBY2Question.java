package JavaPrograms.Java8.StreamsPractice.CollectorsPractice;

import JavaPrograms.Model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupBY2Question {
    public static void main(String[] args) {
        HashMap<Employee, Integer> employeeIntegerHashMap = new HashMap<>();
        employeeIntegerHashMap.put(new Employee("Basant", 27, "DepA"), 0);
        employeeIntegerHashMap.put(new Employee("Rahul", 28, "DepA"), 0);
        employeeIntegerHashMap.put(new Employee("Sunny", 23, "DepA"), 0);

        System.out.println(employeeIntegerHashMap
                .keySet()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDesignation)));
    }
}
