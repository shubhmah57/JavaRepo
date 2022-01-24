package JavaPrograms.Java8.StreamsPractice.CollectorsPractice;

import JavaPrograms.Java8.StreamsPractice.Model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByExpression {
    public static void main(String[] args) {
        List<Employee> employeeList =Arrays.asList(
                        new Employee("phagwara", "Palahi Road"),
                new Employee("phagwara", "Palahi Road"),
                new Employee("jalandhar", "Vijay Nagar"),
                new Employee("jalandhar", "Kapurthala Chowk")
        );

        Map<String, List<Employee>> cityMap = new HashMap<>();
        System.out.println("----------Before Java8-----------");
        for(Employee employee: employeeList){
            System.out.println("Inside for" + cityMap.containsKey(employee.getCity()));
            if(!cityMap.containsKey(employee.getCity())){
                cityMap.put(employee.getCity(), new ArrayList<>());
            }
                cityMap.get(employee.getCity()).add(employee);
        }
        cityMap.entrySet().forEach(x-> System.out.println(x.getKey() + x.getValue()));
        System.out.println("-----------After Java8-------------");

        Map<String, List<Employee>> employeesMap  = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));

        employeesMap.entrySet().stream().forEach(x-> System.out.println(x.getKey() + x.getValue()));

    }
}
