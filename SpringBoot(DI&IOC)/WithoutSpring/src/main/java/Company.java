

public class Company {

    Employee employee;

    Company(){

        employee = new Employee("Shubham", "SeniorEngineer");
    }

    public void getDetails(){
        System.out.println("Company Name: Nagarro");
        System.out.println(employee);

    }
}
