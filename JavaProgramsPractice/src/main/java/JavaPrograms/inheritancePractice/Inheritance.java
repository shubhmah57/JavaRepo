package JavaPrograms.inheritancePractice;

class AB {
    public void hert(){
        System.out.println("Inside PArent class");
    }
}

public class Inheritance extends AB {

    @Override
    public void hert() {
        super.hert();
        System.out.println("Inside child class");
    }

    public static void main(String[] args) {
        AB object =  new Inheritance();
        object.hert();

//        Inheritance object1 =  new AB();
//        object1.hert();
    }


}
