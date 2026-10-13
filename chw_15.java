/*
### 15. Object Creation in Java

**Definition:**
Object creation means creating an **object of a class** using the `new` keyword.

### Simple Example:

```java id="m5q2kx"
class Student {
    String name = "Hemant";

    void show() {
        System.out.println(name);
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.show();
    }
}
```

### Explanation:

```java
Student s1 = new Student();
```

* `Student` → Class name
* `s1` → Reference variable
* `new` → Creates a new object
* `Student()` → Calls the constructor

**Simple:**
👉 `new` keyword is used to **create an object** in Java.
 */