package StringFormatting;

public class Main {
    public static void main(String[] args) {
        // (\u2022) is the UNI Code Character to include bullet point character
        String bulletIt = "Print a Bulleted List:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        System.out.println("==============================================");

        String textBlock = """
                Print a Bulleted List
                          \u2022 First Point
                                \u2022 Sub Point""";
        System.out.println(textBlock);
        System.out.println("==============================================");

        int age = 35;
        // also we can replace \n by %n
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your age is %f\n", (float)age);
        System.out.printf("Your age is %.2f\n", (float)age);
        System.out.println("==============================================");

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, year of birth = %d\n", age, yearOfBirth);
        System.out.println("==============================================");

        for (int i=1 ; i <= 10000 ; i *= 10){
            System.out.printf("Printing %6d %n",i);
        }
        System.out.println("==============================================");
        // The String class itself has two method to support this type of formatting as well
        // One is a Static method called format
        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);
        /* Second is the formatted but when you use this method you just pass the argument that
        match the specifiers in the current string */
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
