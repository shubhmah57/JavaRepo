package JavaPrograms.DesignPatterns.Builder;

public class EmployeeBuilder {

    private int id;
    private String name;
    private String salary;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public Employee buildEmployeeWithoutSalary(){
        return new Employee(id, name);
    }

    public Employee buildEmployeeWithSalary(){
        return  new Employee(id,name, salary);
    }
}
