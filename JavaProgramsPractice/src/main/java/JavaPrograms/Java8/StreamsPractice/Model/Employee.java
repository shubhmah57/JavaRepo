package JavaPrograms.Java8.StreamsPractice.Model;

public class Employee {
    private String city;

    private String address;

    private Double salary;

    private String  gender;



    public Employee(String city, String address, Double salary, String gender) {
        this.city = city;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\''+
                '}';
    }
}
