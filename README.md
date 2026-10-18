# Library Management System

A small Java project that models a library's books using object-oriented programming. It demonstrates inheritance, custom exceptions, and sorting with `Comparable`.

## Features

- **`Book`**: base class with an ID, title, and year published. Implements `Comparable<Book>`, so books sort by `bookID`.
- **`ReferenceBook`**: extends `Book` and adds a reference section (e.g. "Computer Science"). Includes a `getDetails()` method that returns a formatted description.
- **`InvalidReferenceSectionException`**: custom runtime exception thrown when a reference section is `null` or empty.
- **`Main`**: demo that creates several reference books, triggers and catches the custom exception, sorts the books by ID, and prints their details.

## Project Structure

```
Library_Management_System/
├── pom.xml
└── src/main/java/com/mycompany/library_management_system/
    ├── Book.java
    ├── ReferenceBook.java
    ├── InvalidReferenceSectionException.java
    └── Main.java
```

## Requirements

- Java 23 (set in `pom.xml`)
- Maven (optional; you can also run it from NetBeans or compile with `javac`)

## How to Run

**With Maven:**

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.library_management_system.Main"
```

**With javac:**

```bash
javac -d out src/main/java/com/mycompany/library_management_system/*.java
java -cp out com.mycompany.library_management_system.Main
```

## Example Output

```
Caught an exception: Reference section cannot be empty.
Book ID: 1, Title: Java Programming, Year Published: 2020, Reference Section: Computer Science
Book ID: 2, Title: Data Structures, Year Published: 2019, Reference Section: General
Book ID: 3, Title: Algorithms, Year Published: 2021, Reference Section: Mathematics
```

## Concepts Demonstrated

- Inheritance and constructor chaining (`super(...)`, `this(...)`)
- Input validation with a custom exception
- `try`/`catch` exception handling
- Sorting objects with `Comparable` and `Arrays.sort`

## Author

xolan
