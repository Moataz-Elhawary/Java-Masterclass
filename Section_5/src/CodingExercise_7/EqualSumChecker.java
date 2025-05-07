package CodingExercise_7;

public class EqualSumChecker {
    public static void main(String[] args) {

        // Test Code
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }


    public static boolean hasEqualSum (int one, int two, int three){
        int sum = one+two;
        return sum == three;

    }

    // Another Solution
    /*
    public static boolean hasEqualSum (int one, int two, int three){
         return (one+two) == three ;
     }
     */
}