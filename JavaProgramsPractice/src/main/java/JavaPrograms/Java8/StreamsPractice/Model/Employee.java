package JavaPrograms.Java8.StreamsPractice.Model;

public class Employee {
    private String city;

    private String address;

    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String city, String address, Double salary) {
        this.city = city;
        this.address = address;
        this.salary = salary;
    }

    public Employee(String city, String address) {
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
