package CodingExercise_6;

public class DecimalComparator {
    public static void main(String[] args) {
        // Test Code
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstVariable, double secondVariable) {

        if ((long) (firstVariable * 1000) != (long) (secondVariable * 1000)) {
            return false;
        } else {
            return true;
        }
    }
}
