package AllAboutString;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        System.out.println("===========================");
        printInformation("");
        System.out.println("===========================");
        printInformation("\t   \n");
        System.out.println("===========================");

        /*You can search for a single character or a string.*/
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.println("============================================");

        /*first method call position of the first L in hello world. And the second method, last index of,*/
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.println("============================================");

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));
        System.out.println("============================================");

        /*Lets we covered string comparison and string inspection methods*/
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        System.out.println("===========================================");

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        System.out.println("==========================================");

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Contents match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        /*Now, let's look at the difference between is empty and is blank*/
        if (string.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        /*But if the string is blank, this means there are still characters,
        but they're just white space characters like tabs, new lines, spaces, etc*/
        if (string.isBlank()) {
            System.out.println("Blank String");
        }

        /* we use the method charAt() and pass it 0,
           which gets the first character in the string and %c just print a single character */
        System.out.printf("First Character: %c %n", string.charAt(0));

        /* For character sequences in Java, the position starts with 0,
         and the last character is (string length - 1) */
        System.out.printf("Last Character: %c %n", string.charAt(length - 1));


    }
}
