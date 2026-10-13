
// 30. Types of Polymorphism in Java

/*
There are two types of polymorphism:

1. Compile-Time Polymorphism:
   It is achieved through method overloading.
   The method to execute is determined at compile time.

2. Runtime Polymorphism:
   It is achieved through method overriding.
   The method to execute is determined at runtime.

Example of Compile-Time Polymorphism:
*/

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
Example of Runtime Polymorphism:
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

public class chw_30 {
    public static void main(String[] args) {

        // Compile-Time Polymorphism
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));

        // Runtime Polymorphism
        Animal a = new Dog();
        a.sound();
    }
}

/*
Output:
30
60
Dog barks

Interview Answer:
Java has two types of polymorphism:
1. Compile-time polymorphism, achieved through
   method overloading.
2. Runtime polymorphism, achieved through
   method overriding.
*/
