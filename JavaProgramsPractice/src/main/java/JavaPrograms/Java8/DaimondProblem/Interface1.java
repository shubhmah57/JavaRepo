package JavaPrograms.Java8.DaimondProblem;

public interface Interface1 {

    public void method1();

    public default void log(){
        System.out.println("Inside Interface1");
    }

    public static void print(){
        System.out.println("Printing");
    }
}
