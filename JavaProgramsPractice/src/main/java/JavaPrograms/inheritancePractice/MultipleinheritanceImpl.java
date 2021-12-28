package JavaPrograms.inheritancePractice;

import java.util.HashMap;
import java.util.Map;

interface A{
    public void show();
    default void pleaseShow(){
        System.out.println("Please SHow!");
    }
}

interface B{
    public void dontShow();
    default void pleaseShow(){
        System.out.println("Please dont SHow!");
    }
}
public class MultipleinheritanceImpl implements A,B {
    @Override
    public void show() {

    }

    @Override
    public void dontShow() {

    }

    @Override
    public void pleaseShow() {
        A.super.pleaseShow();
        B.super.pleaseShow();
    }

    public static void main(String[] args) {
        MultipleinheritanceImpl multipleinheritance = new MultipleinheritanceImpl();
        multipleinheritance.show();
        multipleinheritance.dontShow();
        multipleinheritance.pleaseShow();
        Map<String, String> map = new HashMap<>();
        map.put("1", "ff");
        map.put("1", "ddd");
        System.out.println(map.get("1"));

    }
}
