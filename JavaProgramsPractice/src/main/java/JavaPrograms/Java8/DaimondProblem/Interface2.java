package JavaPrograms.Java8.DaimondProblem;

public interface Interface2 {
    public void method2();

    public default void log(){
        System.out.println("Inside Interface2");
    }

    public static void print(){
        System.out.println("Printing");
    }
}
