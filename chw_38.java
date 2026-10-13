
// 38. Abstraction vs Encapsulation in Java

/*
1. Abstraction:
   Abstraction hides implementation details
   and shows only essential functionality.

2. Encapsulation:
   Encapsulation wraps data and methods into
   a single unit (class) and controls access
   to the data.

Differences:

1. Abstraction:
   Hides implementation details.

   Encapsulation:
   Protects data through access control.

2. Abstraction:
   Achieved using abstract classes and interfaces.

   Encapsulation:
   Achieved using private variables and
   controlled access through methods.

3. Abstraction:
   Focuses on WHAT an object does.

   Encapsulation:
   Focuses on HOW data is protected and accessed.

4. Abstraction:
   Reduces implementation complexity.

   Encapsulation:
   Improves data security and maintainability.

Example of Abstraction:
*/

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

/*
Example of Encapsulation:
*/

class Student {
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class chw_38 {
    public static void main(String[] args) {

        // Abstraction
        Animal a = new Dog();
        a.sound();

        // Encapsulation
        Student s = new Student();
        s.setAge(21);
        System.out.println(s.getAge());
    }
}

/*
Output:
Dog barks
21

Interview Answer:
Abstraction hides implementation details and
shows essential functionality, whereas
encapsulation wraps data and methods into a
class and controls access to the data.

Abstraction focuses on WHAT an object does,
while encapsulation focuses on protecting data
and controlling HOW it is accessed.
*/
