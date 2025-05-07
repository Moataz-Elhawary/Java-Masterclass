package SecondAndMinutesChallenge;

public class Main {
    public static void main(String[] args) {

        /* Test Cases */
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds
                    + "), Must be a positive integer Value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes
                    + "), Must be a positive integer Value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds
                    + "), Must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + " h " + remainingMinutes + " m " + seconds + " s ";
    }
}
