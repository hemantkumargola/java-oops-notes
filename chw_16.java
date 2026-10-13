/*### 16. What is Encapsulation?

**Definition:**
**Encapsulation** is the process of **wrapping data and methods into a single class** and protecting the data from direct access.

### Simple Example:


class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Hemant");

        System.out.println(s1.getName());
    }
}
```

**Output:**

```text
Hemant
```

### Simple Explanation

* `private` → protects the data.
* `setName()` → sets the value.
* `getName()` → gets the value.

👉 **Encapsulation = Data hiding + Data binding**
 */