package JavaPrograms.Model;

import java.util.Comparator;
import java.util.Objects;

public class Employee {

    private int id;
    private String name;

    private int age;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public Employee(int id, String name, int age, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.age==e.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
