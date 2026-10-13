
// 42. When to Use an Interface in Java?

/*
We use an interface in Java in the following cases:

1. To achieve abstraction.
2. To support multiple inheritance of type.
3. To achieve loose coupling.
4. When different classes need to follow
   the same contract.
5. To make code flexible and maintainable.

Example:
*/

interface Payment {
    void pay();
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment through Card");
    }
}

public class chw_42 {
    public static void main(String[] args) {

        Payment p;

        p = new UpiPayment();
        p.pay();

        p = new CardPayment();
        p.pay();
    }
}

/*
Output:
Payment through UPI
Payment through Card

Explanation:
- Both classes implement the Payment interface.
- Both classes provide their own implementation
  of the pay() method.
- We can use the same Payment reference for
  different payment implementations.

Interview Answer:
We use interfaces when different classes need
to follow a common contract, when we need
abstraction, multiple inheritance of type,
and loose coupling. Interfaces make code
more flexible and maintainable.
*/
