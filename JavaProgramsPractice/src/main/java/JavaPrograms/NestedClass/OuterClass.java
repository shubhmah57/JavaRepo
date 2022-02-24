package JavaPrograms.NestedClass;

public class OuterClass {

    static class InnerClass {
        void display(){
            System.out.println("Hello There!");
        }
    }


    public static void main(String[] args) {
        OuterClass.InnerClass nestedObject = new OuterClass.InnerClass();
        nestedObject.display();
    }


}
