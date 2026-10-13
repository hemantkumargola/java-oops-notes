/*### 13. What is `super` Keyword?

**Definition:**
`super` is a keyword in Java that is used to **refer to the immediate parent class**.

### Main Uses of `super`:

1. To access **parent class variables**.
2. To call **parent class methods**.
3. To call the **parent class constructor**.

### Simple Example:

```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void show() {
        System.out.println(super.name);
    }
}
```

**Output:**

Parent


👉 **Simple:** `super` = **parent class reference**.
 */
