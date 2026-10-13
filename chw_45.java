
// 45. hashCode() vs equals() in Java

/*
Definition:

1. equals():
   Compares two objects for logical equality.

2. hashCode():
   Returns an integer hash code for an object.

Differences:

1. equals():
   Returns a boolean value: true or false.

   hashCode():
   Returns an int value.

2. equals():
   Checks whether two objects are logically equal.

   hashCode():
   Helps hash-based collections organize objects.

3. equals():
   Can be overridden to define logical equality.

   hashCode():
   Can be overridden to provide a consistent
   hash code for logically equal objects.

Important Rules:
1. If two objects are equal according to equals(),
   they must have the same hash code.

2. If two objects have the same hash code,
   they are not necessarily equal.

3. If equals() is overridden, hashCode()
   should also be overridden.

Example:
*/

import java.util.Objects;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class chw_45 {
    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = new Student(101);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

/*
Output:
true
true

Explanation:
Both objects have the same id.
Therefore, equals() returns true, and their
hash codes are also equal.

Interview Answer:
equals() checks logical equality between objects,
whereas hashCode() returns an integer used by
hash-based collections such as HashMap and HashSet.
If two objects are equal according to equals(),
they must have the same hash code.
*/
