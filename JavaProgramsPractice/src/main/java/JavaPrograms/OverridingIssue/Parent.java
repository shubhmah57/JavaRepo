package JavaPrograms.OverridingIssue;

public class Parent {
    public void check(int a){
        System.out.println("Inside Linenumber#"+ 5);
    }

    void check(Integer ab){
        System.out.println("Inside LineNUmber#" + 9);
    }
    void check(Float b){
        System.out.println("AT lineNUmber#"+ 12);
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Integer integer = new Integer(5);
        parent.check(integer);
        parent.check(5);
    }
}

