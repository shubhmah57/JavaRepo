package JavaPrograms.Collections;

import JavaPrograms.Model.Employee;

public class EqualityCheck {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Shubham",27,"engineer");
        Employee e2 = new Employee(2,"Rahul",27,"engineer");
        Employee e3  = new Employee(3,"Girish",26,"Senior engineer");
        if(e1.equals(e3)){
            System.out.println("True");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
