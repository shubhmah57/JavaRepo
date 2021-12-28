package JavaPrograms.Java8.StreamsPractice;

import JavaPrograms.Java8.StreamsPractice.Model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReducePractice {

    public static void main(String[] args) {
        List<Integer> agesList = new ArrayList<>();
        agesList.add(56);
        agesList.add(77);
        agesList.add(43);
        agesList.add(23);
        agesList.add(24);

        int sum =  agesList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Employee> employeeLIst = Arrays.asList(new Employee("Phg", "road", 3333.44),
                new Employee("Jal", "near hospital", 444.33),
                new Employee("Jal", "near hospital", 544.33),
                new Employee("Jal", "near hospital", 744.33),
                new Employee("Jal", "near hospital", 4448.6));

        Double averageSalary = employeeLIst.stream().filter(employee -> employee.getCity().equals("Jal"))
                .map(Employee::getSalary)
                .mapToDouble(i->i).average().getAsDouble();
        employeeLIst.stream().filter(e->e.getCity().equals("Jal"))
                        .map(x->x.getSalary())
                                .mapToDouble(h->h).count();
        System.out.println("Average Salary is:" + averageSalary);
    }
}

