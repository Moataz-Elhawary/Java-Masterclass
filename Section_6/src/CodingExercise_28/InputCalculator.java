package CodingExercise_28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        // Type Code Here
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
            try {
                int number = sc.nextInt();
                sum += number;
                counter++;
            } catch (InputMismatchException e) {
                break;
            }

        }
        if (counter > 0) {
            avg = Math.round((double) sum / counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
