package Serialization;

import java.io.Externalizable; // child of Serializable interface
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ExternalizationDemo implements Externalizable{
    String s;
    int i;
    int j;

    public ExternalizationDemo()
    {
        System.out.println("Public No-arg constructor called");
    }

    ExternalizationDemo(String s, int i, int j)
    {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {   
        // serialize only required members
        out.writeObject(s);
        out.writeInt(i);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        s = (String)in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws Exception{
        ExternalizationDemo d = new ExternalizationDemo("Hello", 1, 2);
        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        // Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ExternalizationDemo d1 = (ExternalizationDemo)ois.readObject();
        
        // System.out.println(d.s + d.i + d.j);
        System.out.println(d1.s +"--"+d1.i+"--"+d1.j);

        oos.close();
        ois.close();
    }

}
