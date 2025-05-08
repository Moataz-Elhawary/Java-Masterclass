package CodingExercise_17;

public class FirstLastDigitSum {
    public static void main(String[] args) {

        // Test Code
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit (int number){
        int firstDigit = 0;
        int lastDigit = 0;
        int temp =0;
        lastDigit = number%10;

        if (number < 0){
            return -1 ;
        }

        if (number<=9){
            return number*2;
        }


        while (number >= 10){

            number /= 10;
            firstDigit = number % 10 ;
        }
        return lastDigit+firstDigit;
    }
}
