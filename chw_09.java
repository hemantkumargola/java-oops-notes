/*
### 9. What is a Parameterized Constructor?

**Definition:**
A **parameterized constructor** is a constructor that **takes one or more parameters** to initialize an object with specific values.

### Example:

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Hemant", 21);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

**Output:**

Hemant
21
```

👉 `Student(String n, int a)` is a **parameterized constructor** because it takes parameters.

*/