
// 34. Can Static Methods Be Overridden in Java?

/*
Answer:
No, static methods cannot be overridden in Java.
They are hidden, not overridden.

Definition:
When a child class defines a static method
with the same signature as a static method
in the parent class, it is called
Method Hiding.

Reason:
Static methods belong to the class, not
to individual objects.

Example:
*/

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class chw_34 {
    public static void main(String[] args) {

        Parent p = new Child();

        p.show();

        Child.show();
    }
}

/*
Output:
Parent static method
Child static method

Explanation:
- p is a Parent reference, so p.show()
  calls the Parent static method.
- Child.show() calls the Child static method.
- The method is selected using the reference
  type at compile time, not the object type.

Interview Answer:
No, static methods cannot be overridden because
they belong to the class rather than objects.
If a child class defines a static method with
the same signature, it is called method hiding.
*/
