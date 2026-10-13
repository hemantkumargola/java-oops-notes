/*
### 4. What is an Object?

**Definition:**
An **object** is an instance of a class. It is used to access the data and methods of a class.

**Example:**

*/ 

class Student {
    String name = "Hemant";

    void study() {
        System.out.println("Student is studying");
    }
}

class chw_04 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        s1.study();
    }
}



/*

Here:

* `Student` → **Class**
* `s1` → **Object**
* `new Student()` → Creates the object.
 */