package JavaPrograms.serailization;

import java.io.*;

//superclass not serializable but subclass is
class A {
    int a,b;
    A(){
/*        a= 5;
        b= 6;*/
        System.out.println("com.demo.serailization.A class constructor called");
    }
}

class B extends A implements  Serializable{
        B(){
            System.out.println("com.demo.serailization.B class constructor called");
            a=3;
            b=9;
        }


}

public class Serialization {

    public static void main(String[] args) {
        B obbj = new B();
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
            B obbjj1 = null;
            obbjj1= (B)in.readObject();
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
