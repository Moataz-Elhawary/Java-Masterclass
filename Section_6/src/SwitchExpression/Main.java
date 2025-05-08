package SwitchExpression;

public class Main {
    public static void main(String[] args) {

        // Tests
        printWeekday(0);
        printWeekday(1);
        printWeekday(2);
        printWeekday(3);
        printWeekday(4);
        printWeekday(5);
        printWeekday(6);
        printWeekday(7);
    }

/*
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> {
                String dayOfWeek = "Sunday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 1 -> {
                String dayOfWeek = "Monday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 2 -> {
                String dayOfWeek = "Tuesday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 3 -> {
                String dayOfWeek = "Wednesday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 4 -> {
                String dayOfWeek = "Thursday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 5 -> {
                String dayOfWeek = "Friday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            case 6 -> {
                String dayOfWeek = "Saturday";
                System.out.println(day + " Stands for " + dayOfWeek);
            }
            default -> {
                String dayOfWeek = "Invalid day";
                System.out.println(day + " Stands for " + dayOfWeek);
            }

        }
    }
*/

    // another Way
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " Stands for " + dayOfWeek);
    }

/*
    public static void printWeekDay(int weekDay) {
        if (weekDay == 0) {
            String dayOfWeek = "Sunday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else if (weekDay == 1) {
            String dayOfWeek = "Monday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else if (weekDay == 2) {
            String dayOfWeek = "Tuesday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else if (weekDay == 3) {
            String dayOfWeek = "Wednesday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else if (weekDay == 4) {
            String dayOfWeek = "Thursday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else if (weekDay == 5) {
            String dayOfWeek = "Friday";
            System.out.println(weekDay + " is the " + dayOfWeek);
        } else {
            String dayOfWeek = "Invalid day";
            System.out.println(weekDay + " is the " + dayOfWeek);
        }
    }
*/

    // another Way
    public static void printWeekday(int day) {
        String dayOfWeek = "Invalid day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " Stands for " + dayOfWeek);
    }

}