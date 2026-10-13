
// 31. Method Overloading in Java

/*
Definition:
Method overloading occurs when multiple methods
in the same class have the same name but
different parameter lists.

Rules:
1. Method names must be the same.
2. Parameters must be different in number,
   type, or order.
3. Changing only the return type is not enough.
4. It is an example of compile-time polymorphism.

Example:
*/

class Calculator {

    // Two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Different parameter types
    double add(double a, double b) {
        return a + b;
    }
}

public class chw_31 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
    }
}

/*
Output:
30
60
31.0

Advantages:
1. Improves code readability.
2. Supports compile-time polymorphism.
3. Allows similar operations with different inputs.

Interview Answer:
Method overloading is a feature in Java in which
multiple methods have the same name but different
parameter lists. It is an example of compile-time
polymorphism.
*/
