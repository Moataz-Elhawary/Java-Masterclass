package MinMaxChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxNumber = 0;
        double minNumber = 0;
        int loopCounter = 0;

        while (true) {
            System.out.println("Enter a number , or any character to exit: ");
            String input = sc.nextLine();
            try {
                double validNum = Double.parseDouble(input);
                if (validNum > maxNumber) {
                    maxNumber = validNum;
                }
                if (validNum < minNumber) {
                    minNumber = validNum;
                }
                loopCounter++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("The maximum number is: " + maxNumber + " and the minimum number is: " + minNumber);
    }
}
