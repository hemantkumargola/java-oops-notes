/*1\. throw: In Java, `throw` is a keyword used to explicitly throw an exception object.

2\. throws: In Java, `throws` is a keyword used to declare exceptions that a method may throw during execution. */

/**
 * chw_04
 */


class chw_04 {
    public static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        }

        System.out.println("You are eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
