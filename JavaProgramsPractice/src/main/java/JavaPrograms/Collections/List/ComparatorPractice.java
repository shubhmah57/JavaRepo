package JavaPrograms.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}

public class ComparatorPractice {

    public static void main(String[] args) {
        Employee E1 = new Employee("ABC", 100000);
        Employee E2 = new Employee("DEF", 200000);
        Employee E3 = new Employee("GHI", 300000);
        Employee E4 = new Employee("JKL", 400000);

        List<Employee> ls = new ArrayList<>();
        ls.add(E1);
        ls.add(E2);
        ls.add(E3);
        ls.add(E4);
        Comparator<Employee> comparator = (o1, o2) -> {
            if(o1.salary > o2.salary){
                return -1;
            }
            if (o1.salary < o2.salary){
                return 1;
            }
          return 0;
        };
        Collections.sort(ls, comparator);

        for(Employee employee : ls){
            System.out.print(employee.name + " : ");
            System.out.print(employee.salary);
            System.out.println();
        }
    }
}
