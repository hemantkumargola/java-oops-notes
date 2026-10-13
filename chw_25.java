/*```java
// 25. Inheritance vs Composition in Java

/*
1. Inheritance:
   Inheritance represents an "IS-A" relationship.
   One class inherits properties and methods
   from another class using the extends keyword.

   Example:
*/

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
}

/*
2. Composition:
   Composition represents a "HAS-A" relationship.
   One class contains an object of another class.
   It helps reuse functionality without inheritance.

   Example:
*/

class Engine {
    void start() {
        System.out.println("Engine is starting");
    }
}

class Car {
    private Engine engine = new Engine();

    void startCar() {
        engine.start();
    }
}

/*
Difference:

Inheritance:
- Represents an IS-A relationship.
- Uses the extends keyword.
- Creates a parent-child relationship.
- Can lead to tight coupling.

Composition:
- Represents a HAS-A relationship.
- Uses objects of other classes.
- Combines objects to provide functionality.
- Often provides more flexibility.

Interview Answer:
Inheritance represents an IS-A relationship,
whereas composition represents a HAS-A relationship.
Inheritance uses the extends keyword, while
composition uses objects of other classes.
Composition is often preferred when we want
flexibility and loose coupling.
 */