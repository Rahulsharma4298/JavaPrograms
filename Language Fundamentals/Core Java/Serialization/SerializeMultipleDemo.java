package Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Animal implements Serializable{
    public String name = "animal";
    public String color = "white";
    public int id = 567;
}

class Account implements Serializable{
    public float balance = 5000;
}

public class SerializeMultipleDemo {
    public static void main(String[] args) throws Exception{
        Animal a = new Animal();
        Account ac = new Account();

        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.writeObject(ac);

        // Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
    
        // order is important, and we should be aware about the order
        // use instance of if we dont know the order, to type cast.
        Object o = ois.readObject();
        if(o instanceof Animal)
        {
            Animal a1 = (Animal)o;
            System.out.println(a1.name);
        }
        else if(o instanceof Account)
        {
            Account ac1 = (Account)o;
            System.out.println(ac1.balance);
        }
        oos.close();
        ois.close();
    }
}
