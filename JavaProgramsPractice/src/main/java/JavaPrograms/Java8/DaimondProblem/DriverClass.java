package JavaPrograms.Java8.DaimondProblem;

public class DriverClass implements  Interface1,Interface2{
    public static void main(String[] args) {
        Interface1 interface1 = new DriverClass();
        interface1.log();
    }

    @Override
    public void method1() {
        System.out.println("Inside Driver Class");
    }

    @Override
    public void log() {
        System.out.println("Calling from the extended method");
        Interface1.super.log();
        Interface2.super.log();
    }

    @Override
    public void method2() {
        System.out.println("Inside Driver Class");
    }
}
