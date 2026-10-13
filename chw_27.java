/*```java
// 27. Rules for Method Overriding in Java

/*
1. Same Method Name:
   The parent and child methods must have
   the same name.

2. Same Parameters:
   Both methods must have the same parameters.

3. Inheritance Required:
   Method overriding requires a parent-child
   class relationship.

4. Return Type:
   The return type must be the same or
   a covariant return type.

5. Access Modifier:
   The child method cannot have a more
   restrictive access modifier.

6. static Methods:
   Static methods cannot be overridden;
   they are hidden.

7. final Methods:
   Final methods cannot be overridden.

8. private Methods:
   Private methods cannot be overridden
   because they are not inherited.

9. @Override Annotation:
   It is optional but recommended.
   It helps the compiler detect mistakes.

10. Exception Rule:
    A child method cannot declare broader
    checked exceptions than the parent method.

11. Constructors:
    Constructors cannot be overridden.

Interview Answer:
Method overriding requires the same method
name and parameters in a child class.
The return type must be compatible, and the
access level cannot be more restrictive.
Static, final, and private methods cannot
be overridden.
*/
