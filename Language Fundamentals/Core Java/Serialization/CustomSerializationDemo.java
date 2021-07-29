package Serialization;
import java.io.*;

//  Custom Serialization Demos
class Accounts implements Serializable
{
    public String userName = "rahul";
    transient String password = "rj123";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream os) throws IOException
    {
        os.defaultWriteObject(); // write non-transient members of current class to this stream
        String epwd = "123" + password; // encryption
        int epin = pin + 4444;
        os.writeObject(epwd);
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException
    {
        is.defaultReadObject();
        String epwd = (String)is.readObject();
        int epin = is.readInt();
        password = epwd.substring(3); // decryption
        pin = epin - 4444;
    }

    // these methods above will be automatically called by JVM,
    // if it is defined, otherwise default serialization/deserialization
    // will be performed
}

public class CustomSerializationDemo {
    public static void main(String[] args) throws Exception {
        Accounts a = new Accounts();
        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // Deserializationb
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Accounts a1 = (Accounts)ois.readObject();
        System.out.println("Username: "+a1.userName);
        System.out.println("Password: "+a1.password);
        System.out.println("Pin: "+a1.pin);
        oos.close();
        ois.close();
    }
}
