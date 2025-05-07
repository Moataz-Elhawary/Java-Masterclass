package CodingExercise_1;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        // Tests

        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);

    }

    public static void checkNumber(int number) {
        if (number != 0) {
            if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("positive");
            }
        } else {
            System.out.println("zero");
        }
    }

}


