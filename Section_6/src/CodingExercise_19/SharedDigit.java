package CodingExercise_19;

public class SharedDigit {
    public static void main(String[] args) {

        // Test Code
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }


    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)) {
            return false;
        }


        return (numberOne % 10 == numberTwo % 10) || (numberOne % 10 == numberTwo / 10) || (numberOne / 10 == numberTwo % 10) || (numberOne / 10 == numberTwo / 10);
// Another Way
/*
        if (numberOne % 10 == numberTwo % 10) {
            return true;
        } else if (numberOne % 10 == numberTwo / 10) {
            return true;

        } else if (numberOne / 10 == numberTwo % 10) {
            return true;
        } else if (numberOne / 10 == numberTwo / 10) {
            return true;
        } else {
            return false;
               }
*/


    }
}
