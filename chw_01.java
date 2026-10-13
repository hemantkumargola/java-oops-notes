/*What is OOPs?

OOPs (Object-Oriented Programming) is a programming approach where a program is designed using objects and classes.

Simple Definition:

OOPs is a programming concept that organizes code using classes and objects to make programs easier to develop, reuse, and maintain.
 */




/* example of oops  */

class Student {
    String name = "Hemant";
    int age = 21;

    void study() {
        System.out.println("Student is studying");
    }
}

class chw_01 {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();
    }
}


/*
1 Code Reusability – Code can be reused using inheritance.

2 Easy Maintenance – Code is easier to update and maintain.

3 Security – Data can be protected using encapsulation.

4 Flexibility – Programs can be easily modified and extended.

5 Modularity – Large programs can be divided into small classes.

6 Easy to Understand – Objects and classes make code easier to understand.

*/

