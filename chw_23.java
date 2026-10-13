/*```java
// 23. Why Java Does Not Support Multiple
// Inheritance Through Classes?

/*
Answer:

Java does not support multiple inheritance
through classes to avoid ambiguity and
the Diamond Problem.

Diamond Problem:
When two parent classes have a method with
the same name and a child class inherits
both classes, the compiler may get confused
about which method to execute.

Example:

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

// Not allowed in Java
// class C extends A, B { }

Reason:
If class C inherits both A and B,
which show() method should it call?

Java avoids this ambiguity by not allowing
multiple inheritance through classes.

Solution:
Java supports multiple inheritance through
interfaces.

Interview Answer:
Java does not support multiple inheritance
through classes because it can create ambiguity
and the Diamond Problem. However, Java supports
multiple inheritance through interfaces.
*/