
// 41. Abstract Class vs Interface in Java

/*
1. Abstract Class:
   A class declared using the abstract keyword.
   It can contain abstract and concrete methods.

2. Interface:
   A reference type that defines a contract
   for implementing classes.

Differences:

1. Keyword:
   Abstract Class: abstract
   Interface: interface

2. Methods:
   Abstract Class: Abstract and concrete methods.
   Interface: Abstract, default, static, and
   private methods.

3. Variables:
   Abstract Class: Instance and static variables.
   Interface: Variables are public, static,
   and final by default.

4. Inheritance:
   Abstract Class: A class can extend only
   one class.

   Interface: A class can implement multiple
   interfaces.

5. Constructor:
   Abstract Class: Can have constructors.
   Interface: Cannot have constructors.

6. Keyword for Use:
   Abstract Class: extends
   Interface: implements

7. Access Modifiers:
   Abstract Class: Methods can use different
   access modifiers.

   Interface: Abstract methods are public
   by default.

Example:
*/

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class chw_41 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
        d.play();
    }
}

/*
Output:
Dog barks
Animal is eating
Dog is playing

Interview Answer:
An abstract class can contain instance variables,
constructors, abstract methods, and concrete
methods. An interface defines a contract and
supports multiple inheritance of type.
A class extends an abstract class but implements
an interface.
*/
