# Introduction to Java

Java is a purely object-oriented language. It was developed by James Gosling in 1995. The Green Team initiated the project in June 1991 to create a language for televisions. Initially, it was called "Greentalk," and later renamed "Oak." However, as "Oak" was already a trademark, James came up with the idea of "Java."

## How Java Works
Java compiles the code into bytecode, which is then interpreted into machine code.

### Notes:
- **JDK (Java Development Kit):** A collection of tools used for developing and running Java programs.
- **JRE (Java Runtime Environment):** Helps in executing programs developed in Java.

## Data Types in Java

### 1. Primitive Data Types
These have predefined sizes in Java.
- **Numeric:** `int`, `float`.
- **Non-numeric:** `char`, `boolean`.

### 2. Non-Primitive Data Types
These are user-defined and do not have fixed sizes in Java, e.g., arrays and strings.

## Code Tutorials
In Java, all code is written inside one public class. This class includes the function:
```java
public static void main(String[] args)
```
where the main code execution starts.

### Printing in Java
To print something in Java, use:
```java
System.out.println("Print something");
```

### Taking Input
To take string input in Java, use:
```java
sc.nextLine();
```

### Example Code
Below is a complete example demonstrating basic Java features:
```java
package basics_of_java;

// Import library in Java for taking input from the user
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        // Print in Java
        System.out.println("anjali");

        // Data types in Java
        int marks = 12;
        String name = "anjali";
        boolean isValid = true;
        float number = 2.34f;
        char addiv = 's';

        System.out.println(marks);
        System.out.println(name);
        System.out.println(isValid);
        System.out.println(number);
        System.out.println(addiv);

        // Type casting
        double mate = (double) marks;
        System.out.println(mate);

        // Taking user input
        Scanner sct = new Scanner(System.in);
        int age = sct.nextInt();
        System.out.println(age);

        // Conditional statements
        if (age > 18) {
            System.out.println("You can vote");
        } else if (age == 0) {
            System.out.println("You cannot vote");
        } else {
            System.out.println("You should not vote");
        }

        // Switch case
        switch (age) {
            case 24:
                System.out.println("You cannot vote");
                break;
            case 26:
                System.out.println("You cannot vote");
                break;
            case 30:
                System.out.println("You cannot vote");
                break;
            default:
                System.out.println("Wrong");
        }

        // Loops: for, while, do-while
        for (int i = 0; i < 4; i++) {
            System.out.println("anjali");
        }

        int j = 0;
        while (j < 3) {
            System.out.println("kadyan");
            j++;
        }

        int k = 0;
        do {
            System.out.println("tony");
            k++;
        } while (k < 2);

        // Array in Java
        int[] date = new int[5];
        date[0] = 78;
        date[1] = 98;
        date[2] = 67;
        date[3] = 98;
        date[4] = 34;

        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }

        System.out.println(average(3, 7));

        // Exception handling
        try {
            System.out.println(date[7]);
        } catch (Exception e) {
            System.out.println("Error occurred");
            System.out.println(e.getLocalizedMessage());
        }
    }

    // Method or function
    static int average(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
```

