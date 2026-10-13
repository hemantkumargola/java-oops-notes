
// 44. == vs equals() in Java

/*
Definition:

1. == Operator:
   Compares primitive values.
   For objects, it compares references
   (whether they refer to the same object).

2. equals() Method:
   Compares objects for logical equality
   when the class defines that behavior.
   The default implementation in Object
   compares references.

Differences:

1. ==:
   Operator in Java.

   equals():
   Method of the Object class.

2. ==:
   Compares primitive values or object references.

   equals():
   Compares logical object equality when
   properly overridden.

3. ==:
   Cannot be overridden.

   equals():
   Can be overridden in a class.

Example:
*/

class Student {
    int age;

    Student(int age) {
        this.age = age;
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
        return this.age == other.age;
    }
}

public class chw_44 {
    public static void main(String[] args) {

        Student s1 = new Student(21);
        Student s2 = new Student(21);
        Student s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
    }
}

/*
Output:
false
true
true

Explanation:
s1 == s2:
False because they are different objects.

s1.equals(s2):
True because both Student objects have
the same age and equals() compares their ages.

s1 == s3:
True because both references point
to the same object.

Interview Answer:
The == operator compares primitive values
or object references, whereas equals() compares
logical object equality when the class overrides
the equals() method. By default, Object.equals()
compares references.
*/
