package JavaPrograms.abstractclassconstructor;

public class DemoChild extends  Demo{

    int a;
    int b;


    DemoChild(int i, int j) {
        super(i,j);
        System.out.println(this.i + " " + this.j);
        this.a = 6;
        this.b= 8;

    }

    @Override
    public void secondMethod() {

    }

    public static void main(String[] args) {
        DemoChild demoChild = new DemoChild(7, 9);

        System.out.println(demoChild.a);
    }
}
