  /*### 10. Can a Constructor Be Private?

**Yes**, a constructor can be **private** in Java.

A private constructor **cannot be accessed from outside the class**.

### Example:

class Student {

    private Student() {
        System.out.println("Constructor called");
    }
}


👉 **Use:** Private constructors are commonly used in **Singleton Design Pattern** and to prevent object creation from outside the class.
 */