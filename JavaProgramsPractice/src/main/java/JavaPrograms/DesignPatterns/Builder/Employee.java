package JavaPrograms.DesignPatterns.Builder;



public class Employee {

    private int id;
    private String name;
    private String salary;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
