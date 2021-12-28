package JavaPrograms.serailization;

import java.io.*;

class A1 implements  Serializable{
    int a;
    int b=8;
    A1(){
        System.out.println("com.demo.serailization.A class constructor called");
    }
}

class B1 extends A1 {

    int b;
    B1(){
        System.out.println("com.demo.serailization.B class constructor called");
        a=3;
        b=9;
    }


}

public class Serialization1 {

    public static void main(String[] args) {
        B1 obbj = new B1();
        System.out.println("com.demo.serailization.B is: " + obbj.a + obbj.b);
        String fileName ="com.demo.serailization.Serialization.ser";
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);
            outputStream.writeObject(obbj);
            outputStream.close();
            file.close();

            FileInputStream file1 = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file1);
            B1 obbjj1 = null;
            obbjj1= (B1)in.readObject();
            in.close();
            file1.close();
            System.out.println("com.demo.serailization.A:" + obbjj1.a);
            System.out.println("com.demo.serailization.B:" + obbjj1.b);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
