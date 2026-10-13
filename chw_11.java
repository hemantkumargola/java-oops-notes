/*
### 1. Can a Constructor Be Inherited?

**No**, constructors **cannot be inherited** in Java.

**Reason:**
A constructor belongs to its own class and is used to initialize objects of that class.

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}
```

👉 The `Child` class **does not inherit** the `Parent` constructor.

**Exam Answer:**

> **No, constructors cannot be inherited in Java.**
 */