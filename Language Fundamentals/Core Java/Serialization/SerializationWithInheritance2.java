package Serialization;
import java.io.*;

class Animals {
    int i = 10;

    Animals()
    {
        System.out.println("Animals class constructor called");
    }
    
}

class Dog extends Animals implements Serializable{
    int j = 20;

    Dog()
    {
        System.out.println("Dog class constructor called");
    }
}

public class SerializationWithInheritance2 {
    public static void main(String[] args) throws Exception{
        Dog d = new Dog();
        d.i = 888;
        d.j = 999;

        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        System.out.println("Deserialization Started");
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d1 = (Dog)ois.readObject();

        System.out.println(d1.i+"----"+d1.j);
        oos.close();
        ois.close();
    }
}

