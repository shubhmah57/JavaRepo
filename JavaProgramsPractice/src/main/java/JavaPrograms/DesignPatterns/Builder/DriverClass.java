package JavaPrograms.DesignPatterns.Builder;

public class DriverClass {
    public static void main(String[] args) {
        Employee salariedEmployee =new EmployeeBuilder()
                            .setId(1)
                            .setName("Shubham")
                            .setSalary("140")
                            .buildEmployeeWithSalary();
        Employee newEmployee = new EmployeeBuilder()
                .setId(1)
                        .setName("Shubham").buildEmployeeWithoutSalary();
        System.out.println(salariedEmployee);
        System.out.println(newEmployee);
    }
}
