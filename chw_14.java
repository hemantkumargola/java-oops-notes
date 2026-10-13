/*### 14. `this()` vs `super()`

| `this()`                                            | `super()`                                         |
| --------------------------------------------------- | ------------------------------------------------- |
| Calls the **current class constructor**.            | Calls the **parent class constructor**.           |
| Used to call another constructor of the same class. | Used to call the constructor of the parent class. |
| Refers to the current class.                        | Refers to the parent class.                       |
| Example: `this(10);`                                | Example: `super(10);`                             |

### Simple Example

```java
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
    }

    Child(int x) {
        super();
        System.out.println("Child Constructor");
    }
}
```

👉 **`this()` = Current class constructor**
👉 **`super()` = Parent class constructor**
 */