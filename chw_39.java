
// 39. What is an Abstract Class in Java?

/*
Definition:
An abstract class is a class declared with
the abstract keyword. It can contain both
abstract methods and concrete methods.

Important Points:
1. Declared using the abstract keyword.
2. Cannot be instantiated directly.
3. Can contain abstract and concrete methods.
4. Can have constructors and variables.
5. Can have static and final methods.
6. A child class must implement inherited
   abstract methods unless it is abstract.
7. It can have zero or more abstract methods.

Example:
*/

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }

    // Constructor
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class chw_39 {
    public static void main(String[] args) {

        // Animal a = new Animal(); // Not allowed

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}

/*
Output:
Animal constructor
Dog barks
Animal is eating

Advantages:
1. Supports abstraction.
2. Provides code reusability.
3. Allows common behavior to be shared.
4. Supports runtime polymorphism.

Interview Answer:
An abstract class is a class declared using
the abstract keyword. It cannot be instantiated
directly and can contain both abstract and
concrete methods. It is used to achieve
abstraction and share common functionality.
*/
