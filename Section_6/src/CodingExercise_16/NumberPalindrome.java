package CodingExercise_16;

public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int number) {
        int originalNumber = number ;
        int reversedNumber = 0;


        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            originalNumber /= 10;
        }

        return number == reversedNumber;
    }

}
