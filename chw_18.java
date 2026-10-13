/*
## 18. How to achieve Encapsulation in Java?

**Answer:** We can achieve encapsulation in Java by declaring variables as `private` and providing `public` getter and setter methods to access and modify them in a controlled way.

### Example:

```java
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
```

### Key Points:
1. Declare data members as `private`.
2. Use getter methods to read data.
3. Use setter methods to modify data.
4. Apply validation when required.

**Interview Tip:** Encapsulation provides data hiding and controlled access to data. */