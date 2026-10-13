/*```java
// 21. What is Inheritance in Java?

/*
Definition:
Inheritance is a mechanism in Java in which
one class acquires the properties and methods
of another class.

Advantages:
1. Code Reusability
2. Reduces Code Duplication
3. Easy Code Maintenance
4. Supports Method Overriding

Important Terms:
1. Parent Class: The class whose properties
   and methods are inherited.
2. Child Class: The class that inherits
   properties and methods from the parent class.
3. extends: Keyword used to inherit a class.

Example:

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}

Output:
Animal is eating
Dog is barking

Interview Answer:
Inheritance is an OOP concept in which one
class acquires the properties and methods of
another class using the extends keyword.
It promotes code reusability.
*/
