package Serialization;
import java.io.*;

class A implements Serializable
{
    B b = new B();

}

class B implements Serializable
{
    C c = new C();
}

class C implements Serializable
{
    int i = 10;
}

public class ObjectGraphSerializeDemo {
    public static void main(String[] args) throws Exception {
        A a = new A();
        // object of b and c is reachable by object of a,
        // so when we serialize Object of a , b and c will be automatically
        // serialized. All object of object graph should be serializable

        //Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        //Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A a1 = (A)ois.readObject();
        System.out.println(a1.b.c.i);
        ois.close();
        oos.close();
    }

}
