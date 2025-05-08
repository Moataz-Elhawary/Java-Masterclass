package Switch;

public class Main {
    public static void main(String[] args) {


/*
        int value = 1;
        if (value == 1) {
            System.out.println("value Was 1");
        } else if (value == 2) {
            System.out.println("value Was 2");
        } else {
            System.out.println("value not 1 or 2");
        }
*/

        /************************************************************************************/

        // Traditional Switch Statement
/*
        int switchValue = 6;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was 3 or 4 or 5 ");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("was not 1 , 2 , 3 , 4 , or 5 ");
                break;
        }
*/
        /************************************************************************************/


        // Enhanced Switch Statement
/*
        int switchValue = 6;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was 3 or 4 or 5 ");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("was not 1 , 2 , 3 , 4 , or 5 ");
        }
*/

        // Tests
        String month = "October";
        System.out.println(month + " is " + getQuarter(month));
    }

    public static String getQuarter(String month) {
        // Use Traditional Way
/*
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st Quarter";
            case "April":
            case "May":
            case "June":
                return "2nd Quarter";
            case "July":
            case "August":
            case "September":
                return "3rd Quarter";
            case "October":
            case "November":
            case "December":
                return "4th Quarter";
        }
        return "Month Was Invalid";

*/

        // Use Enhanced Way
        return switch (month) {
            case "January", "February", "March" -> "in the 1st Quarter";
            case "April", "May", "June" -> "in the 2nd Quarter";
            case "July", "August", "September" -> "in the 3rd Quarter";
            case "October", "November", "December" -> "in the 4th Quarter";
            default -> "Invalid";
        };
    }
}


