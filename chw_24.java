/*```java
// 24. Single vs Multilevel Inheritance in Java

/*
1. Single Inheritance:
   One child class inherits from one parent class.

   Example:
*/

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

/*
Structure:

Animal (Parent)
   |
  Dog (Child)


2. Multilevel Inheritance:
   A class inherits from another child class,
   forming a chain of inheritance.

   Example:
*/

class Animal2 {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog2 {
    void weep() {
        System.out.println("Weeping");
    }
}

/*
Structure:

Animal2 (Grandparent)
   |
  Dog2 (Parent)
   |
  Puppy (Child)


Difference:

Single Inheritance:
One parent class -> One child class

Multilevel Inheritance:
Grandparent -> Parent -> Child


Interview Answer:
Single inheritance means one child class
inherits from one parent class.

Multilevel inheritance means a class inherits
from another derived class, forming a chain.
*/
