package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    public String studentID;
    public String studentName;
    // if we dont want to serialize particular member due to security concern, 
    // use transient modifier, jvm will save its default value instead of original value 
    transient String password = "abc123";

    // Static variable is not part of object state hence they won't participate in
    // serialization because of this declaring a static variable as transient there 
    // is no use.
    static transient int counter = 0;

    // final variables will be participated into serialization directly by their values.
    // Hence declaring a final variable as transient there is no use.
    final transient String schoolID = "ICS123";


    Student(String studentName)
    {   
        this.studentID = "ABC124";
        this.studentName = studentName;
        counter++;
    }
}

public class SerializationDeserializationDemo {
    public static void main(String[] args) throws Exception{
        Student s = new Student("Rahul");
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        System.out.println("Serialization Ended");
        System.out.println("Deserialization Started");
        FileInputStream fis = new FileInputStream("abc.ser"); // any extension can be used
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student)ois.readObject();
        ois.close();
        System.out.println("Deserialization Ended");
        System.out.println("Name: "+s1.studentName+"\nID: "+s1.studentID);
        System.out.println("Password: "+s1.password); // null 
        // System.out.println(s1.counter);
        System.out.println(s1.schoolID);
        


    }
}
