// 35. Dynamic Method Dispatch in Java

/*
Definition:
Dynamic Method Dispatch is a process in which
a call to an overridden method is resolved
at runtime rather than compile time.

It is an example of Runtime Polymorphism.

Important Points:
1. Inheritance is required.
2. Method overriding is required.
3. A parent class reference can refer to
   a child class object.
4. The method is selected based on the actual
   object type at runtime.
5. It applies to overridden instance methods.

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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class chw_35 {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

/*
Output:
Dog barks
Cat meows

Explanation:
- Animal a is a parent class reference.
- First, it refers to a Dog object.
  Therefore, Dog's sound() method executes.
- Next, it refers to a Cat object.
  Therefore, Cat's sound() method executes.

Interview Answer:
Dynamic Method Dispatch is a mechanism in Java
where an overridden method call is resolved
at runtime based on the actual object type.
It supports runtime polymorphism.
*/












/*
note

## Difference Between Dynamic and Dynamic Method Dispatch

### 1. Dynamic
Dynamic means that a decision is made at runtime (when the program is running).

### 2. Dynamic Method Dispatch
Dynamic Method Dispatch is a mechanism in Java in which the method to be executed is decided at runtime based on the actual object.

### Example:
```java
Animal a = new Dog();
a.sound();
```

Here, `Animal` is the reference type, but `Dog` is the actual object. Therefore, Java calls the `Dog` class's overridden `sound()` method at runtime.

### Key Difference:
- **Dynamic:** A general term related to runtime behavior.
- **Dynamic Method Dispatch:** A specific mechanism used to achieve runtime polymorphism in Java.

**Remember:** Dynamic is a general term, whereas Dynamic Method Dispatch is a specific Java mechanism.

*/