package academy.javapro;

// TODO: import the necessary classes for the following code to work.

public class Midterm2 {

    /**
     * Simple Person class used for demonstration.
     */
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // TODO: Override the toString() method to provide a meaningful string representation of the Person object.
    }

    /**
     * Merges two collections of different types into a new collection using a BiFunction.
     *
     * @param <T>              The type of elements in the first collection
     * @param <S>              The type of elements in the second collection
     * @param <R>              The type of elements in the resulting collection
     * @param firstCollection  The first collection containing elements of type T
     * @param secondCollection The second collection containing elements of type S
     * @param mergeFunction    The function that defines how to merge elements from both collections
     * @return A new collection containing the merged elements
     * @throws IllegalArgumentException if the collections have different sizes
     */
    public static <T, S, R> List<R> mergeCollections(
            Collection<T> firstCollection,
            Collection<S> secondCollection,
            BiFunction<T, S, R> mergeFunction) {

        // TODO: Before performing the merge operation, validate that both input collections have the same size
        //       to ensure element-wise merging is possible. If the sizes differ, throw an IllegalArgumentException
        //       clearly stating the mismatch, including the actual sizes of both collections. This ensures the method
        //       operates safely by preventing out-of-bounds errors or data inconsistencies during the merge process.
        //       The exception message should provide clarity by including the actual sizes of both collections using:
        //       "Collections must have the same size for element-wise merging. " +
        //       "First collection size: " + firstCollection.size() +
        //       ", Second collection size: " + secondCollection.size());

        // TODO: Initialize a new list named 'result' to store the merged elements.
        //       Set its initial capacity to the size of the first collection to optimize performance.

        // TODO: Convert both input collections to arrays for indexed access.
        //       Use firstArray for the array of type T and secondArray for the array of type S.
        //       This allows simple element-wise merging using a for loop.

        // TODO: Loop through the arrays using a for loop. At each index, apply the mergeFunction
        //       to the corresponding elements from firstArray and secondArray.
        //       Add the result of the merge to the 'result' list.

        // TODO: Return the list containing the merged results.
        throw new UnsupportedOperationException(
                "The mergeCollections method is not implemented yet.");
    }

    /**
     * Alternative implementation that doesn't require equal-sized collections.
     * Instead, it pairs elements until one collection is exhausted.
     */
    public static <T, S, R> List<R> zipCollections(
            Collection<T> firstCollection,
            Collection<S> secondCollection,
            BiFunction<T, S, R> mergeFunction) {

        // TODO: Initialize the 'result' list with an initial capacity set to the minimum size of the two input collections.
        //       This is a precautionary measure in scenarios where input validation might be relaxed or reused elsewhere.
        //       While this method currently enforces equal sizes, using Math.min() provides a safe and flexible approach
        //       and helps optimize memory allocation for the result list.

        // Use iterators to traverse both collections simultaneously
        // TODO: Initialize iterators for both input collections to enable sequential access to their elements.
        //       Use 'firstIterator' for iterating over 'firstCollection' and 'secondIterator' for iterating over 'secondCollection'.
        //       These iterators will be used to traverse both collections in parallel during the element-wise merge.

        // TODO: Iterate through both collections in parallel using a while loop that checks if both iterators have more elements.
        //       In each iteration, retrieve the next element from 'firstIterator' and 'secondIterator' as 'firstElement' and 'secondElement' respectively.
        //       Apply the 'mergeFunction' to these elements to produce a merged result of type R.
        //       Add the merged result to the 'result' list.
        //       This ensures element-wise merging in the order of the original collections.

        // TODO: Return the list containing the merged results.
        throw new UnsupportedOperationException(
                "The mergeCollections method is not implemented yet.");
    }

    public static void main(String[] args) {
        // Example 1: Merging numbers and strings
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> words = Arrays.asList("one", "two", "three", "four", "five");

        // Define a merge function that combines an integer and a string
        BiFunction<Integer, String, String> numberWordMerger =
                (num, word) -> num + " = " + word;

        List<String> combinedNumberWords = mergeCollections(numbers, words, numberWordMerger);

        System.out.println("Example 1: Merging numbers with their word representations");
        combinedNumberWords.forEach(System.out::println);

        // Example 2: Creating Person objects from names and ages
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> ages = Arrays.asList(25, 30, 22);

        // Define a merge function that creates a Person from name and age
        BiFunction<String, Integer, Person> personCreator = Person::new;

        List<Person> people = mergeCollections(names, ages, personCreator);

        System.out.println("\nExample 2: Creating Person objects from names and ages");
        people.forEach(System.out::println);

        // Example 3: Merging using mathematical operations
        List<Double> firstNumbers = Arrays.asList(1.5, 2.5, 3.5);
        List<Double> secondNumbers = Arrays.asList(0.5, 1.0, 1.5);

        // Several different merge functions
        BiFunction<Double, Double, Double> sum = Double::sum;
        BiFunction<Double, Double, Double> product = (a, b) -> a * b;
        BiFunction<Double, Double, String> comparisonResult =
                (a, b) -> a + " vs " + b + ": " + (a > b ? "First is larger" :
                        a < b ? "Second is larger" :
                                "Both are equal");

        List<Double> sums = zipCollections(firstNumbers, secondNumbers, sum);
        List<Double> products = zipCollections(firstNumbers, secondNumbers, product);
        List<String> comparisons = zipCollections(firstNumbers, secondNumbers, comparisonResult);

        System.out.println("\nExample 3: Mathematical operations");
        System.out.println("Sums: " + sums);
        System.out.println("Products: " + products);
        System.out.println("Comparisons:");
        comparisons.forEach(System.out::println);

        // Example 4: Using different sized collections with zipCollections
        List<Character> letters = Arrays.asList('A', 'B', 'C', 'D', 'E');
        List<Integer> positions = Arrays.asList(1, 2, 3); // Shorter list

        BiFunction<Character, Integer, String> positionedLetter =
                (letter, position) -> position + ". " + letter;

        List<String> lettersWithPositions = zipCollections(letters, positions, positionedLetter);

        System.out.println("\nExample 4: Using different sized collections");
        lettersWithPositions.forEach(System.out::println);
    }
}

