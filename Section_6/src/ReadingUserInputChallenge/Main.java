package ReadingUserInputChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        System.out.println("Please enter a 5 numbers to get sum : ");

        while (counter <= 5) {
            System.out.println("Enter number # " + counter + " :");

            try {
//                int input  = sc.nextInt();
                double input = sc.nextDouble(); // this if I want to sum whole numbers with floating numbers
                sum += input;
                counter++;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. ");
                sc.next();
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);


        // Another way Using do-while loop

/*
       do {
            System.out.println("Enter number # " + counter + " :");

            try {
//                int input  = sc.nextInt();
                double input = sc.nextDouble(); // this if I want to sum whole numbers with floating numbers
                sum += input;
                counter++;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. ");
                sc.next();
            }
        } while ((counter <= 5));

        System.out.println("The sum of the 5 numbers = " + sum);
*/
    }
}
