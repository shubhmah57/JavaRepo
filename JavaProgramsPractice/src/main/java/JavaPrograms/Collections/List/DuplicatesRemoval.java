package JavaPrograms.Collections.List;

import JavaPrograms.Model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesRemoval {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Shubham",27,"engineer"));
        employeeList.add(new Employee(2,"Rahul",27,"engineer"));
        employeeList.add(new Employee(3,"Girish",26,"engineer"));
        employeeList.add(new Employee(3,"Girish",26,"engineer"));
        Set<Employee> employees = new HashSet<>(employeeList);
        //System.out.print(employees +  " ");
        employeeList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        Set<Employee> employees1 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getAge() == e2.getAge() ? 0 : 1;
            }
        });
        employees1.addAll(employeeList);


    }
}



