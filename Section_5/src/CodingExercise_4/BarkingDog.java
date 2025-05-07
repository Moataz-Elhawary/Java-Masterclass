package CodingExercise_4;

public class BarkingDog {
    public static void main(String[] args) {

        // Tests
        boolean isBarking;
        isBarking = shouldWakeUp(true, 1);
        System.out.println(isBarking);
        System.out.println("===========================");
        isBarking = shouldWakeUp(false, 2);
        System.out.println(isBarking);
        System.out.println("===========================");
        isBarking = shouldWakeUp(true, 8);
        System.out.println(isBarking);
        System.out.println("===========================");
        isBarking = shouldWakeUp(true, -1);
        System.out.println(isBarking);


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if ((hourOfDay < 8 || hourOfDay > 22) && barking)
                return true;
        }
        return false;
    }
}
