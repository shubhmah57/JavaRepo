package JavaPrograms.Collections.List;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String[] args) {
        List<Employee3> list = new ArrayList<>();
        list.add(new Employee3(123, "zMadhu", "1000$", 1));
        list.add(new Employee3(332, "bSudhan", "2000$", 2));
        list.add(new Employee3(54, "cKongarass", "3000$", 3));
        list.add(new Employee3(54, "xKongarass", "3000$", 4));
        list.add(new Employee3(54, "aKongarass", "3000$", 5));

        Set<Employee3> em = new HashSet<>(list);
        System.out.println(em);

    }
}

class Employee3 {

    private int id;
    private String name;
    private String salary;
    private String recordStatus;
    private int key;

    public Employee3(int id, String name, String salary, int key) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee3)) return false;

        Employee3 employee = (Employee3) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}