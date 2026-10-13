
// 32. Method Overloading vs Method Overriding in Java

/*
1. Method Overloading:
   Multiple methods have the same name but
   different parameter lists.

2. Method Overriding:
   A child class provides its own implementation
   of a method inherited from the parent class.

Differences:

1. Overloading:
   Same method name, different parameters.

   Overriding:
   Same method name and parameters.

2. Overloading:
   Usually occurs within the same class.

   Overriding:
   Requires inheritance.

3. Overloading:
   Compile-time polymorphism.

   Overriding:
   Runtime polymorphism.

4. Overloading:
   Return type alone cannot distinguish methods.

   Overriding:
   Return type must be the same or covariant.

5. Overloading:
   Inheritance is not required.

   Overriding:
   Inheritance is required.

Example of Overloading:
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
Example of Overriding:
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

public class chw_32 {
    public static void main(String[] args) {

        // Overloading
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));

        // Overriding
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
Overloading means having methods with the same
name but different parameter lists. Overriding
means redefining an inherited method in a child
class. Overloading supports compile-time
polymorphism, while overriding supports
runtime polymorphism.
*/
