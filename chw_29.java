/* 
// 29. What is Polymorphism in Java?

/*
Definition:
Polymorphism means "one name, many forms".

It is an OOP concept in which the same method
or interface can perform different behaviors.

Types of Polymorphism:

1. Compile-Time Polymorphism:
   Achieved through method overloading.

2. Runtime Polymorphism:
   Achieved through method overriding.

Example:
*/
/* 

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

public class chw_29 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal d = new Dog();
        d.sound();
    }
}
*/
/*
Output:
Animal makes a sound
Dog barks

Advantages:
1. Improves code flexibility.
2. Supports code reusability.
3. Makes code easier to maintain.

Interview Answer:
Polymorphism means one name, many forms.
In Java, it allows the same method to behave
differently in different situations.
It is achieved through method overloading
and method overriding.
*/
