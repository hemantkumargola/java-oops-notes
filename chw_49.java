
// 49. Aggregation vs Composition in Java (OOP)

/*
1. Aggregation
----------------
Definition:
Aggregation is a weak HAS-A relationship between
two independent classes.

Important Points:
1. Both objects can exist independently.
2. The child object can exist without the parent object.
3. It represents weak ownership.

Example:
A Department has Teachers.
A Teacher can exist without a Department.
*/

// Aggregation Example

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {
    String departmentName;
    Teacher teacher;

    Department(String departmentName, Teacher teacher) {
        this.departmentName = departmentName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Department: " + departmentName);
        System.out.println("Teacher: " + teacher.name);
    }
}

/*
2. Composition
----------------
Definition:
Composition is a strong HAS-A relationship between
two classes, where the containing object owns the
contained object.

Important Points:
1. It represents strong ownership.
2. The contained object's lifecycle is tied to
   the containing object conceptually.
3. It is stronger than aggregation.

Example:
A House has Rooms.
A Room is considered part of its House in this model.
*/

// Composition Example

class Room {
    void show() {
        System.out.println("Room exists inside the House.");
    }
}

class House {
    private Room room;

    House() {
        room = new Room();
    }

    void display() {
        room.show();
    }
}

public class chw_49 {
    public static void main(String[] args) {

        // Aggregation
        Teacher t = new Teacher("Amit");
        Department d = new Department("Computer Science", t);

        d.display();

        System.out.println();

        // Composition
        House h = new House();
        h.display();
    }
}

/*
Output:
Department: Computer Science
Teacher: Amit

Room exists inside the House.

3. Aggregation vs Composition
------------------------------

Aggregation:
- Weak HAS-A relationship.
- Objects can exist independently.
- Example: Department and Teacher.

Composition:
- Strong HAS-A relationship.
- The contained object's lifecycle is tied
  to the owner conceptually.
- Example: House and Room in this model.

4. Interview Answer
--------------------

Aggregation is a weak HAS-A relationship in which
the child object can exist independently of the
parent object.

Composition is a strong HAS-A relationship in which
the child object's lifecycle is tied to the parent
object conceptually.

Example:
Department and Teacher represent aggregation.
House and Room can represent composition.
*/ 
