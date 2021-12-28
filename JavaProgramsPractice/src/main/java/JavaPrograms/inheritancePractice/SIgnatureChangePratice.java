package JavaPrograms.inheritancePractice;

public class SIgnatureChangePratice extends  Parent{

    public static void main(String[] args) {

    }

    /**@Override
    *public void same(String str) throws  Exception{
    Can't change the signature in child class

    }*/
}

class Parent{

    public void same(String str){

    }
}