
// 37. What is Abstraction in Java?

/*
Definition:
Abstraction is an OOP concept that hides
implementation details and shows only
essential features to the user.

How to Achieve Abstraction:
1. Abstract Classes
2. Interfaces

Important Points:
1. An abstract class is declared using
   the abstract keyword.
2. An abstract method has no method body.
3. An abstract class cannot be instantiated.
4. A child class must implement inherited
   abstract methods unless it is also abstract.

Example:
*/

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class chw_37 {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}

/*
Output:
Dog barks
Animal is eating

Advantages:
1. Hides implementation details.
2. Reduces complexity.
3. Improves code maintainability.
4. Supports code reusability and flexibility.

Interview Answer:
Abstraction is an OOP concept that hides
implementation details and shows only essential
functionality. In Java, abstraction is achieved
using abstract classes and interfaces.
*/
