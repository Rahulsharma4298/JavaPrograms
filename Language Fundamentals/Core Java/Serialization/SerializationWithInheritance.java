package Serialization;

import java.io.*;

// serialization is inheriting in nature,
// if parent class implements Serializable, then child class is also Serializable
class Cat extends Animal{
    Cat()
    {
        this.name = "cat";
        this.color = "white";
    }
}

public class SerializationWithInheritance {
    public static void main(String[] args) throws Exception {
        Cat c = new Cat();
        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.json");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);

        // Deserialization
        FileInputStream fis = new FileInputStream("abc.json");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal animal = (Animal)ois.readObject();
        System.out.println(animal.name);
        System.out.println(animal.color);
        System.out.println(animal.id); 
        oos.close();
        ois.close();
    }
}

