/*
### 5. Difference Between Class and Object

| Class                                    | Object                                     |
| ---------------------------------------- | ------------------------------------------ |
| Class is a **blueprint/template**.       | Object is an **instance of a class**.      |
| It defines data and methods.             | It uses the data and methods of the class. |
| It does not represent a specific entity. | It represents a specific entity.           |
| Example: `Student`                       | Example: `s1`                              |
| A class can create multiple objects.     | Each object has its own data.              |

**Simple Example:**




 */

class Student {
    String name;
}

class chw_05 {
    public static void main(String[] args) {
        Student s1 = new Student();  // Object
        s1.name = "Hemant";
    }
}

/*👉 Class = Blueprint
👉 Object = Real thing created from the blueprint
 */