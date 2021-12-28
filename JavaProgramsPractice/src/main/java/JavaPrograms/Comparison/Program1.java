package JavaPrograms.Comparison;

import JavaPrograms.Model.Employee;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Shubham",
                                                                    27,
                                                                    "Senior Engineer"),
                                                    new Employee("Rahul", 28, "SeniorEngineer"),
                                                    new Employee("John", 32, "Architect"),
                                                    new Employee("Krysten", 30, "Associate Architect"));
        Comparator<Employee> comp = (Employee e1, Employee e2)->{
            if(e1.getAge() > e2.getAge()){
                return  -1;
            }
            else if(e1.getAge() < e2.getAge()){
                return 1;
            }
            else{
                return 0;
            }
        };

        Collections.sort(employeeList,comp);

        employeeList.forEach(System.out::println);

    }
}
