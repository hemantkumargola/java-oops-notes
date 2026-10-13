/*
 Why do we use Encapsulation?


1. **Data Hiding:** Protects data from direct access.
2. **Controlled Access:** Allows access through getter and setter methods.
3. **Validation:** Prevents invalid data from being assigned.
4. **Maintainability:** Makes code easier to manage and modify.


## 4. Example

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

## 5. Interview Answer
**Q. Why do we use Encapsulation?**

**Answer:** We use encapsulation to achieve data hiding, provide controlled access to data, validate values, and improve code maintainability.

## 6. Important Points
- `private` variables cannot be accessed directly outside their class.
- Getters are used to read data.
- Setters are used to modify data.
- Encapsulation supports data protection, but it does not automatically guarantee complete security.

 */