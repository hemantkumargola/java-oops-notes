/*### 12. Purpose of `this` Keyword

**Definition:**
`this` is a keyword in Java that refers to the **current object**.

### Main Uses of `this`:

1. **To refer to current class variables**
2. **To call current class methods**
3. **To call another constructor of the same class**

### Simple Example:

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Here, `this.name` refers to the **class variable**, while `name` refers to the **constructor parameter**.

👉 **Simple:** `this` = **current object**.
 */