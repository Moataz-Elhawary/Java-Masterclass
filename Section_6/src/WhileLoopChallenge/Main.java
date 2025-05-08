package WhileLoopChallenge;

public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number + " is Even Number ");
        }

        // Part 2 - of Challenge
        int evenCount = 0;
        int oddCount = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number + " is Even Number ");
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total odd numbers found :" + oddCount);
        System.out.println("Total even numbers found :" + evenCount);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
