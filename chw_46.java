
// 46. Object Cloning in Java

/*
Definition:
Object cloning is the process of creating
a copy of an existing object.

Important Points:
1. The clone() method is defined in the Object class.
2. A class generally implements Cloneable to
   allow cloning through Object.clone().
3. Cloneable is a marker interface.
4. Object.clone() performs a shallow copy.
5. The default clone() method is protected.

Example:
*/

class Student implements Cloneable {

    int age = 21;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

public class chw_46 {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student();

        Student s2 = s1.clone();

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(s1 == s2);
    }
}

/*
Output:
21
21
false

Explanation:
1. s1 is the original object.
2. s2 is a cloned copy of s1.
3. Both objects have the same age value.
4. s1 == s2 returns false because they are
   different objects.

Types of Cloning:

1. Shallow Copy:
   Copies primitive values and object references.
   Referenced objects are shared.

2. Deep Copy:
   Copies nested objects as well, so the copied
   object has independent nested objects.

Interview Answer:
Object cloning is the process of creating a copy
of an existing object using clone(). A class
typically implements Cloneable and calls
super.clone(). The default cloning operation
performs a shallow copy.
*/
