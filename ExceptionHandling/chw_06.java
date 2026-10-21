
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class chw_06 {
    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new MyException("Invalid age!");
            }

            System.out.println("Eligible");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*more example 

class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int withdraw = 1000;

        try {
            if (withdraw > balance) {
                throw new LowBalanceException("Balance is low!");
            }

            System.out.println("Withdraw successful");

        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
 */