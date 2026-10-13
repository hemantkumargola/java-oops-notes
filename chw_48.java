
// 48. Association in Java (OOP)

/*
Definition:
Association is a relationship between two
independent classes where one object is
connected to another object.

Important Points:
1. Association represents a HAS-A relationship.
2. The associated objects can exist independently.
3. It can be one-to-one, one-to-many,
   many-to-one, or many-to-many.
4. Association does not necessarily mean
   ownership.

Example:
*/

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learnFrom(Teacher teacher) {
        System.out.println(name + " learns from "
                + teacher.name);
    }
}

public class chw_48 {
    public static void main(String[] args) {

        Teacher t = new Teacher("Amit");
        Student s = new Student("Rahul");

        s.learnFrom(t);
    }
}

/*
Output:
Rahul learns from Amit

Explanation:
1. Teacher and Student are independent classes.
2. A Student object interacts with a Teacher object.
3. Both objects can exist independently.
4. This relationship is called Association.

Types of Association:
1. One-to-One
2. One-to-Many
3. Many-to-One
4. Many-to-Many

Interview Answer:
Association is an OOP relationship between
two independent classes whose objects interact
with each other. It represents a HAS-A relationship,
and both objects can exist independently.
*/
