package StringOptions;

public class Main {
    public static void main(String[] args) {

        // 1. String Concatenation (Immutable)
        String helloWorld = "Hello" + " World"; // Creates a new String "Hello World"
        helloWorld.concat(" and Goodbye"); // Creates a new String but is lost (not assigned)

        // 2. StringBuilder (Mutable)
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye"); // Modifies the existing StringBuilder

        // 3. Print String & StringBuilder info
        printInformation(helloWorld); // Calls method for String
        printInformation(helloWorldBuilder); // Calls method for StringBuilder
        System.out.println("=".repeat(50)); // Prints 50 "=" for separation

        // 4. StringBuilder with default & specified capacity
        StringBuilder emptyStart = new StringBuilder(); // Default capacity (16)
        emptyStart.append("a".repeat(57)); // Expands capacity as needed

        StringBuilder emptyStart32 = new StringBuilder(32); // Initial capacity = 32
        emptyStart32.append("a".repeat(17)); // Fits within capacity (no expansion needed)

        printInformation(emptyStart); // Prints length & capacity
        printInformation(emptyStart32);
        System.out.println("=".repeat(50));

        // 5. StringBuilder Modifications
        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye"); // Appends text

        // Deletes 'G' at index 16, inserts 'g' (lowercase)
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        // Replaces 'g' with 'G' (uppercase)
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        // Reverses the string & truncates to 7 characters
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    /**
     * Prints information about a String:
     * - The string itself
     * - Its length
     */
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    /**
     * Prints information about a StringBuilder:
     * - The builder's content
     * - Its length (number of characters)
     * - Its capacity (total allocated space)
     */
    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }
}