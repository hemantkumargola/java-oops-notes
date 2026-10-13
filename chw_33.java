
// 33. Can Static Methods Be Overloaded in Java?

/*
Answer:
Yes, static methods can be overloaded in Java.

Definition:
Method overloading means defining multiple
methods with the same name but different
parameter lists in the same class.

Rules:
1. Method names must be the same.
2. Parameters must differ in number, type, or order.
3. Changing only the return type is not enough.
4. Static methods can be overloaded because
   overloading is resolved at compile time.

Example:
*/

class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class chw_33 {
    public static void main(String[] args) {

        System.out.println(Calculator.add(10, 20));

        System.out.println(Calculator.add(10, 20, 30));

        System.out.println(Calculator.add(10.5, 20.5));
    }
}

/*
Output:
30
60
31.0

Interview Answer:
Yes, static methods can be overloaded in Java
because they can have the same name with
different parameter lists. Method overloading
is resolved at compile time.
*/


/*
NOtes ==>  what is static 

Key Points
1. A static method belongs to the class.
2. We can call it without creating an object.
3. It can directly access static members of the class.
4. It cannot directly access non-static members.
5. The main() method is static because the JVM can call it without creating an object of the class.
*/