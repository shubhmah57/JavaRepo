package JavaPrograms.FunctionalInterfacePractice;

public class Program1 {

    public static void main(String[] args) {
        Firstinterface obj = () -> {
            System.out.println("Hello There");
        };
        obj.firstMethod();
    }
}

@FunctionalInterface
interface Firstinterface {

    public void firstMethod();
}