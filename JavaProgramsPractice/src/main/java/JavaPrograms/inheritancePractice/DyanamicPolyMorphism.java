package JavaPrograms.inheritancePractice;

public class DyanamicPolyMorphism {

    public void printA(){
        System.out.println("Hello A");
    }

    public static void main(String[] args) {
        DyanamicPolyMorphism dyanamicPolyMorphism = new ChildDyanamicPloymorphism();
        /**
         * Will Not be able to call printB method as not present in
         * DynamicPolymorphism class.
         * Can't be directly called but it can be called by
         * type casting it to the child class.
         */
        /*dyanamicPolyMorphism.printB();*/

        dyanamicPolyMorphism.printA();

            
        if(dyanamicPolyMorphism instanceof  ChildDyanamicPloymorphism)
            ((ChildDyanamicPloymorphism) dyanamicPolyMorphism).printB();

        DyanamicPolyMorphism dyanamicPolyMorphism1 = new DyanamicPolyMorphism();
        /**
         * This casting will result in Class cast exception as the object
         * dyanamicPolymorsphism1 is not an instance of ChildDyanamicPloymorphism,
         * hence it was correctly used in AMDOCS map files,and we never required
         * map files where object were directly created with new keyword.
         */

        ((ChildDyanamicPloymorphism)(dyanamicPolyMorphism1)).printB();
    }
}

class ChildDyanamicPloymorphism extends DyanamicPolyMorphism{

    public void printB() {
        System.out.println("Hello B");
    }
}
