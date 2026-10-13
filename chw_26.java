/*```java
// 26. Method Overriding in Java

/*
Definition:
Method overriding occurs when a child class
provides its own implementation of a method
already defined in the parent class.

Rules:
1. Method name must be the same.
2. Parameters must be the same.
3. Inheritance is required.
4. Return type must be the same or covariant.
5. The access modifier cannot be more restrictive.
6. The @Override annotation is optional but recommended.

Example:
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class chw_26 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}

/*
Output:
Animal makes a sound
Dog barks

Advantages:
1. Supports runtime polymorphism.
2. Allows customized behavior in child classes.
3. Improves code flexibility and reusability.

Interview Answer:
Method overriding occurs when a child class
provides its own implementation of a method
already defined in the parent class.
It supports runtime polymorphism.
*/