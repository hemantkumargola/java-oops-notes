/*## 2. Exception Hierarchy

                         Object
                            |
                        Throwable
                       /         \
                    Error      Exception
                      |          /     \
                OutOfMemory   Runtime   Other Exceptions
                StackOverflow Exception      |
                              (Unchecked)   Checked
                                  |            |
                         ArithmeticException  IOException
                         NullPointerException SQLException
                         ArrayIndexOutOfBoundsException
```

# JAVA EXCEPTION HANDLING — COMPLETE REVISION NOTES

## 1. Definition
Exception is an unwanted event that interrupts the normal flow of a program.

Exception handling helps us handle runtime problems and continue program execution when possible.



## 3. Types of Exceptions

### A. Checked Exception
- Checked by the compiler.
- Must be caught or declared using throws.
- Examples: IOException, SQLException, ClassNotFoundException.

### B. Unchecked Exception
- Occurs at runtime.
- Compiler does not force us to catch or declare it.
- Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.

### C. Error
- Represents serious JVM or system problems.
- Usually not handled by application code.
- Examples: OutOfMemoryError, StackOverflowError.

## 4. try-catch-finally

- try: Contains code that may throw an exception.
- catch: Handles a matching exception.
- finally: Used for cleanup; normally executes whether an exception occurs or not.

Example:

    public class JavaExceptionHandling {
        public static void main(String[] args) {

            try {
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            } finally {
                System.out.println("Program finished");
            }
        }
    }

Output:

    Cannot divide by zero
    Program finished

Explanation:
1. 10 / 0 throws ArithmeticException.
2. The remaining statements in try are skipped.
3. The matching catch block handles the exception.
4. finally executes normally.

## 5. Multiple catch Blocks

We can use multiple catch blocks to handle different exception types.

    try {
        int[] arr = {10, 20};
        System.out.println(arr[5]);
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic problem");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid array index");
    }

Important: Write more specific exception types before their parent exception types.

## 6. throw Keyword

Used to explicitly throw an exception.

    throw new ArithmeticException("Invalid calculation");

Example:

    public class Main {
        public static void main(String[] args) {
            int age = 15;

            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }

            System.out.println("Allowed");
        }
    }

## 7. throws Keyword

Used in a method declaration to indicate exceptions that the method may pass to its caller.

    import java.io.IOException;

    class Main {
        static void readFile() throws IOException {
            throw new IOException("File problem");
        }
    }

Difference:
- throw: Actually throws an exception object.
- throws: Declares possible exceptions in a method signature.

## 8. Custom Exception

We can create our own exception class.

    class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    class Main {
        static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible");
            }
        }

        public static void main(String[] args) {
            try {
                checkAge(16);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

Output:

    Not eligible

## 9. Important Exception Methods

- getMessage(): Returns the exception message.
- toString(): Returns exception class name and message.
- printStackTrace(): Prints exception details and stack trace.

## 10. try-with-resources

Automatically closes resources that implement AutoCloseable.

Example:

    try (java.io.FileReader reader =
             new java.io.FileReader("data.txt")) {
        System.out.println(reader.read());
    } catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }

Useful for files, streams, and database resources.

## 11. Important Rules

1. A try block must be followed by at least one catch block or a finally block.
2. A catch block handles only compatible exception types.
3. Multiple catch blocks are allowed.
4. A finally block normally executes even if an exception occurs.
5. A finally block may not execute if the JVM terminates abruptly, such as with System.exit().
6. Checked exceptions must be caught or declared.
7. Unchecked exceptions do not require mandatory handling.
8. Avoid catching Exception broadly unless there is a good reason.
9. Do not leave catch blocks empty.
10. Use try-with-resources for automatic resource closing.

*/