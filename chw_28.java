/*```java
// 28. Can Constructors Be Overridden in Java?

/*
Answer:
No, constructors cannot be overridden in Java
because constructors are not inherited by child
classes.

Reason:
Method overriding requires inheritance of a method,
but constructors are not inherited.

Example:
*/

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class chw_28 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

/*
Output:
Parent Constructor
Child Constructor

Explanation:
When a Child object is created, the parent
constructor executes first, followed by the
child constructor.

Important:
- Constructors cannot be overridden.
- Constructors can be overloaded.

Interview Answer:
No, constructors cannot be overridden because
they are not inherited by child classes.
However, constructors can be overloaded.
*/
