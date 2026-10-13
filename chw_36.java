
// 36. Compile-Time vs Runtime Polymorphism in Java

/*
Definition:

1. Compile-Time Polymorphism:
   It is achieved through method overloading.
   The method to execute is determined at compile time.

2. Runtime Polymorphism:
   It is achieved through method overriding.
   The method to execute is determined at runtime.

Differences:

1. Compile-Time:
   Achieved through method overloading.

   Runtime:
   Achieved through method overriding.

2. Compile-Time:
   Inheritance is not required.

   Runtime:
   Inheritance is required.

3. Compile-Time:
   Methods have the same name but different
   parameter lists.

   Runtime:
   The parent and child methods have the same
   signature, with a compatible return type.

4. Compile-Time:
   Resolved by the compiler.

   Runtime:
   Overridden instance method is selected
   based on the actual object type.

5. Compile-Time:
   Also called Static Polymorphism.

   Runtime:
   Also called Dynamic Polymorphism.

Example:
*/

class Calculator {
    // Compile-Time Polymorphism
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Runtime Polymorphism
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class chw_36 {
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
Compile-time polymorphism is achieved through
method overloading, where the method call is
resolved at compile time.

Runtime polymorphism is achieved through method
overriding, where the overridden method is
selected at runtime based on the actual object.
*/
