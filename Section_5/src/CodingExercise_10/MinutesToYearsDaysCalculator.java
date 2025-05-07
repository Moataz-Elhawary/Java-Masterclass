package CodingExercise_10;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        // Test Code
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays (long minutes){
        if (minutes < 0 )
        {System.out.println("Invalid Value");
            return;}
        long days = ((minutes / 60L) / 24L );
        long remainingDays = days % 365L;
        long year = days / 365L;
        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
    }
}
