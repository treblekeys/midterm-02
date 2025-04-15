# Midterm 2 - Java Collections and Generics

## Project Overview

In this assignment, you will implement a generic method that merges two collections of different types into a new
collection using a `BiFunction`. This lab demonstrates advanced Java concepts including generics, functional interfaces,
and collection manipulation.

## Project Setup

1. Open the project in your IDE
2. Locate the starter code at: `src/main/java/Midterm2.java`
3. Do not modify the class name
4. Implement the required functionality

## Task Description

You need to implement a generic collection merger with the following components:

- A generic method `mergeCollections` that can merge two collections of different types
- A generic method `zipCollections` as an alternative implementation
- Example implementations in the main method

## Functional Requirements

The `mergeCollections` method should:

- Accept two collections of different types (`T` and `S`)
- Accept a `BiFunction` that defines how to merge elements from both collections
- Throw an exception if collections have different sizes
- Return a new collection containing the merged elements

The `zipCollections` method should:

- Accept two collections of different types (`T` and `S`)
- Accept a `BiFunction` that defines how to merge elements from both collections
- Handle collections of different sizes by pairing elements until one collection is exhausted
- Return a new collection containing the merged elements

## Implementation Details

1. Implement the `mergeCollections` method with appropriate generic type parameters
2. Implement the `zipCollections` method with appropriate generic type parameters
3. Demonstrate usage with various examples in the main method
4. Ensure proper exception handling

## Testing Your Implementation

To test your implementation, run the provided `main` method. The code performs the following tasks:

- Creates different collections of integers, strings, and other types
- Merges collections using different `BiFunction` implementations
- Demonstrates different use cases (creating strings, objects, mathematical operations)
- Shows handling of collections with different sizes

Your output should match the expected output format below:

```text
Example 1: Merging numbers with their word representations
1 = one
2 = two
3 = three
4 = four
5 = five

Example 2: Creating Person objects from names and ages
Person{name='Alice', age=25}
Person{name='Bob', age=30}
Person{name='Charlie', age=22}

Example 3: Mathematical operations
Sums: [2.0, 3.5, 5.0]
Products: [0.75, 2.5, 5.25]
Comparisons:
1.5 vs 0.5: First is larger
2.5 vs 1.0: First is larger
3.5 vs 1.5: First is larger

Example 4: Using different sized collections
1. A
2. B
3. C

Process finished with exit code 0
```

## Evaluation Criteria

Your assignment will be evaluated based on:

- Correctness of implementation
- Proper use of Java generics
- Handling of edge cases
- Code organization and clarity
- Documentation quality
- Adherence to Java coding conventions

## Tips

- Understand how generic type parameters work across method boundaries
- Make sure to consider edge cases (empty collections, null values)
- Use clear and descriptive variable names
- Test your implementation with various data types
- Consider the type safety implications of your implementation