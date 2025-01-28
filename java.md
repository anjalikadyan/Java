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

# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) allows developers to solve real-world problems by taking real-world entities and translating them into objects and blueprints (classes). Below are the main concepts of OOP with examples:

## 1. Class and Object
A class is a blueprint for objects, and objects are instances of a class. Objects are used to access the class's variables and methods.

```java
class Person {
    String name;
    int age;

    // Methods
    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Alice";
        p1.age = 25;

        p2.name = "Bob";
        p2.age = 30;

        p1.walk();
        p2.eat();
    }
}
```

## 2. Polymorphism
Polymorphism means performing a single action in different ways. For example, we can overload the `walk` method with different parameters.

```java
class Person {
    void walk() {
        System.out.println("Walking with no arguments.");
    }

    void walk(int steps) {
        System.out.println("Walking " + steps + " steps.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        p.walk(); // No arguments
        p.walk(10); // With arguments
    }
}
```

## 3. Constructors
Constructors are used to initialize objects. They are called when an object is created.

```java
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        p.display();
    }
}
```

If you want to call one constructor from another, use the `this()` keyword:

```java
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Default Name", 0); // Calling parameterized constructor
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
```

## 4. Inheritance
Inheritance allows a child class to inherit properties and methods from a parent class.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // Inherited from Animal
        d.bark();
    }
}
```

The `super` keyword is used to call the parent class's constructor:

```java
class Animal {
    Animal() {
        System.out.println("Animal created.");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the parent class constructor
        System.out.println("Dog created.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
```


### Abstraction 
In Java, interfaces provide a mechanism for achieving abstraction. All variables in an interface are implicitly **public**, **static**, and **final**, while all methods are implicitly **public** and **abstract** (unless they are static or default methods).

### Example of an Interface:
```java
// Defining an interface
interface Animal {
    // Abstract method (no body, to be implemented by classes)
    void makeSound();

    // Final variable (constant)
    int numberOfLegs = 4; // Implicitly public, static, and final
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Outputs: Woof Woof

        Animal cat = new Cat();
        cat.makeSound(); // Outputs: Meow
    }
}
```

### Explanation:
1. **Animal Interface**:
   - Defines the structure (method signature) without any implementation.
   - Ensures that every class implementing it will define the `makeSound` method.

2. **Dog and Cat Classes**:
   - Provide their own implementation of the `makeSound` method, adhering to the `Animal` interface.

3. **Main Class**:
   - Uses the `Animal` interface to interact with objects of `Dog` and `Cat`, hiding their internal implementation.

---

### Benefits of Abstraction
1. **Reduced Complexity**: Simplifies program interaction.
2. **Flexibility**: Allows changes in the implementation without affecting the interface.
3. **Code Reusability**: Promotes reuse of abstracted logic.
4. **Improved Maintenance**: Easier to maintain and update the code.

---

## 5. Encapsulation
Encapsulation groups variables and methods that work together, and it helps in achieving data hiding.

### Example of Encapsulation:
```java
class Person {
    private String name;
    private int age;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Alice");
        person.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName()); // Outputs: Name: Alice
        System.out.println("Age: " + person.getAge());   // Outputs: Age: 25

        // Trying to set an invalid age
        person.setAge(-5); // Outputs: Age must be positive.
    }
}
```

### Explanation:
1. **Private Variables**:
   - Ensure that the data (name and age) cannot be directly accessed from outside the `Person` class.

2. **Getter and Setter Methods**:
   - Provide controlled access to the private variables.
   - Allow validation before assigning values (e.g., ensuring age is positive).

3. **Main Class**:
   - Demonstrates how encapsulation enforces controlled interaction with the `Person` class.

---

By combining abstraction and encapsulation, you can design systems that are both flexible and secure.

## Arrays in Java

An **array** is a collection of elements of the same type stored in a single variable. It is useful for storing multiple values of the same type efficiently.

In Java, arrays are first declared and then initialized. After that, data can be stored in the array.

## Declaring an Array
To declare an array in Java, specify the type of elements followed by square brackets:
```java
int[] numbers; // Declaration of an integer array
String[] names; // Declaration of a string array
```

## Initializing an Array
An array can be initialized at the time of declaration or later:

### 1. At the time of declaration:
```java
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};
```

### 2. Later initialization:
```java
int[] numbers = new int[5]; // Creates an array of size 5
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

## Accessing Array Elements
Array elements can be accessed using their index (starting from 0):
```java
System.out.println(numbers[0]); // Outputs the first element
System.out.println(names[2]);  // Outputs "Charlie"
```

## Example: Printing Array Elements
```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Looping through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```

## Example: Finding the Largest Number in an Array
```java
public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest number is: " + max);
    }
}
```

## Notes:
- Arrays have a fixed size, which cannot be changed after initialization.
- Use `array.length` to get the size of an array.
- Array indices start at 0 and end at `array.length - 1`.


