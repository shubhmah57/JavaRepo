package JavaPrograms.serailization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class bulletmotorcycle implements Externalizable{

    static int age;
    String name;
    int year;

    bulletmotorcycle(){

    }

    bulletmotorcycle(String name, int year){
        this.name= name;
        this.year=year;
    }

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings,
     * and arrays.
     *
     * @param out the stream to write the object to
     * @throws IOException Includes any I/O exceptions that may occur
     * @serialData Overriding methods should use this tag to describe
     * the data layout of this Externalizable object.
     * List the sequence of element types and, if possible,
     * relate the element to a public/protected field and/or
     * method of this Externalizable class.
     */
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(name);
        out.writeInt(year);
        out.writeInt(age);
    }

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     *
     * @param in the stream to read data from in order to restore the object
     * @throws IOException            if I/O errors occur
     * @throws ClassNotFoundException If the class for an object being
     *                                restored ca
     *                                nnot be found.
     */
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        age= in.readInt();
        year= in.readInt();
    }

    @Override
    public String toString() {
        return ("Name=" + name + "Age:" + age + "year:" + year);
    }
}

public class ExternalizeSerialization {
    public static void main(String[] args) {
        bulletmotorcycle bulletmotorcycle = new bulletmotorcycle("Shubham", 13);
    }


}
