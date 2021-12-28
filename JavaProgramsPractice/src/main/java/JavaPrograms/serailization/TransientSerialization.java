package JavaPrograms.serailization;

import java.io.*;

class A11 implements Serializable {
    int a =4;
    transient int b=3;
}

public class TransientSerialization {

    public static void main(String[] args) {
        A11 obbje = new A11();
        try {
            FileOutputStream outputStream = new FileOutputStream("com.demo.serailization.Serialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(obbje);
            FileInputStream inputStream = new FileInputStream("com.demo.serailization.Serialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            A11 obbbj = null;
            /**
             * This is the deserialization process, no call to the
             * default constructor is there only directly readobject
             * is called so no default constructor is called.
             */
            obbbj = (A11)objectInputStream.readObject();
            System.out.println(obbbj.a);
            System.out.println(obbbj.b);

        } catch (Exception e){
            e.printStackTrace();;
        }

    }
}
