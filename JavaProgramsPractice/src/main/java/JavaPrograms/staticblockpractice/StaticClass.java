package JavaPrograms.staticblockpractice;

public class StaticClass {
    int a, b;
    static {
        multiply();
    }
    /*StaticClass(){
        StaticClass();
    }*/
    public static  void multiply(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Integer pa = null;
        Integer i = pa;
        System.out.println(i);
        System.out.println(demo.a.name());
    }
    enum  demo{
        a, b, c,d
    }
}
