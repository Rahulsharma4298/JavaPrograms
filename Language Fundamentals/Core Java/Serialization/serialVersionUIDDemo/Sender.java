package Serialization.serialVersionUIDDemo;

import java.io.*;

class Cat implements Serializable{
    // configuring our own serialVersionUID:-
    private final long serialVersionUID = 1L;

    String name = "kitty";
    String color = "white";
}

public class Sender {
    public static void main(String[] args) throws Exception{
        Cat c = new Cat();
        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        System.out.println("Serialization Completed");

        // serialVersionUID is used during deserialization to verify that the sender 
        // (the person who serializes) & receiver (the person who deserializes) of a serialized 
        // object have loaded classes for that object that are compatible with respect to 
        // serialization.
    }

}
