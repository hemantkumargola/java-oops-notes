
// 47. Object Serialization in Java

/*
Definition:
Serialization is the process of converting
an object into a byte stream so that it can
be stored in a file or transmitted over a network.

Deserialization:
It is the process of converting a byte stream
back into an object.

Important Points:
1. A class must implement Serializable.
2. Serializable is a marker interface.
3. ObjectOutputStream is used for serialization.
4. ObjectInputStream is used for deserialization.
5. The transient keyword prevents a field from
   being serialized by default.
6. serialVersionUID helps verify class compatibility.

Example:
*/

import java.io.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id = 101;
    String name = "Hemant";
}

public class chw_47 {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        Student s1 = new Student();

        // Serialization
        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream("student.ser"));

        out.writeObject(s1);
        out.close();

        System.out.println("Object serialized");

        // Deserialization
        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("student.ser"));

        Student s2 = (Student) in.readObject();
        in.close();

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}

/*
Output:
Object serialized
101
Hemant

Interview Answer:
Serialization is the process of converting
an object into a byte stream for storage or
transmission. In Java, a class typically
implements Serializable, and ObjectOutputStream
is used to serialize objects. Deserialization
converts the byte stream back into an object.
*/
