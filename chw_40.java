
// 40. What is an Interface in Java?

/*
Definition:
An interface is a reference type in Java
that defines a contract for classes to follow.

Important Points:
1. Declared using the interface keyword.
2. Cannot be instantiated directly.
3. A class implements an interface using
   the implements keyword.
4. Interface abstract methods are public
   and abstract by default.
5. Interface variables are public, static,
   and final by default.
6. Interfaces can have default, static,
   and private methods.
7. A class can implement multiple interfaces.
8. Interfaces support abstraction.

Example:
*/

interface Animal {

    // Abstract method
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class chw_40 {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}

/*
Output:
Dog barks

Advantages:
1. Supports abstraction.
2. Supports multiple inheritance of type.
3. Promotes loose coupling.
4. Improves code flexibility.
5. Makes code easier to maintain.

Interview Answer:
An interface in Java defines a contract that
implementing classes must follow. It is declared
using the interface keyword and implemented
using the implements keyword. A class can
implement multiple interfaces.
*/
