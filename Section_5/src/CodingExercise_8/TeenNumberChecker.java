package CodingExercise_8;

public class TeenNumberChecker {
    public static void main(String[] args) {

        // Test Code
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);

    }

    public static boolean isTeen(int var) {
        return (var >= 13) && (var <= 19);
    }

}

