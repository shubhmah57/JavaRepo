package JavaPrograms.Java8.FunctionalInterface.MethodParameter;

interface AddTwoNumbers{
    int add(int a, int b);
}

public class Programm1 {

    public static void main(String[] args) {
       performAddition((a, b) -> a+b);
    }

    public  static  void  performAddition(AddTwoNumbers addTwoNumbers){
        System.out.println(addTwoNumbers.add(8,9));
    }
}
