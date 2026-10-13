
// 43. What is the Object Class in Java?

/*
Definition:
The Object class is the root class of Java.
Every class directly or indirectly inherits
from the Object class.

Package:
java.lang

Important Points:
1. Object is the parent class of all Java classes.
2. Every class inherits Object class methods.
3. We can override methods like toString(),
   equals(), and hashCode().
4. Java does not require us to extend Object
   explicitly.

Important Methods:
1. toString()  - Returns a string representation
                 of an object.
2. equals()    - Compares objects for equality.
3. hashCode()  - Returns an integer hash code.
4. getClass()  - Returns the runtime class
                 of an object.
5. clone()     - Creates a copy of an object
                 when cloning is supported.
6. wait()      - Makes a thread wait.
7. notify()    - Wakes one waiting thread.
8. notifyAll() - Wakes all waiting threads.

Example:
*/

class Student {

    int age = 21;

    @Override
    public String toString() {
        return "Student age: " + age;
    }
}

public class chw_43 {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.toString());
        System.out.println(s.getClass().getName());
    }
}

/*
Output:
Student age: 21
Student

Interview Answer:
The Object class is the root class of Java.
Every class directly or indirectly inherits
from it. It provides common methods such as
toString(), equals(), hashCode(), and getClass().
*/
