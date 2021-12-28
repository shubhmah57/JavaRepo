package JavaPrograms.DataStructures;

public class DoubleCheck {

    public static void main(String[] args) {
      /*  Object d = new Double(123);
        String s = (String)d;
        System.out.println(s);*/
        DoubleCheck check = new DoubleCheck();
        check.printThis();
    }

    public void printThis(){
        System.out.println(this);
    }
}
