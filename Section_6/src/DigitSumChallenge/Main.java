package DigitSumChallenge;

public class Main {
    public static void main(String[] args) {

        // Tests
        System.out.println("The sum of the digits in number 1234 IS -> " + sumDigits(1234));
        System.out.println("The sum of the digits in number -2345 IS -> " + sumDigits(-2345));
        System.out.println("The sum of the digits in number 1 IS -> " + sumDigits(1));
        System.out.println("The sum of the digits in number 10 IS -> " + sumDigits(10));
        System.out.println("The sum of the digits in number 32123 IS -> " + sumDigits(32123));

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            sum += (number % 10);
            number /= 10;

        }
        sum += number;
        return sum;

    }
}
