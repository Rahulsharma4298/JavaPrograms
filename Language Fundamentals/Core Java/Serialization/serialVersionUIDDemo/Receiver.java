package Serialization.serialVersionUIDDemo;
import java.io.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        // Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c1 = (Cat)ois.readObject();
        System.out.println("Deserialization Completed");
        System.out.println(c1.name+"\n");
        ois.close();

        // now even if we do the changes in local class before deserialization in 
        // receiver side or the jvm version/platform is different, no issue because 
        // we have defined our own serialVersionUID than the one generated by JVM by default.

        // If we depend on default serialVersionUID generated by JVM at the time of
        // serialization, then if we do changes in local class file before deserialization
        // or platform/version of JVM is not same, the uid will not match and we would get
        // Runtime Exception - InvalidClassException
    }
}
