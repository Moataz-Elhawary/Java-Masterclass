package WhileLoop;

public class Main {
    public static void main(String[] args) {

        // The differences between for and while and do-While
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("=========================================");

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("=========================================");
        j = 1;
        boolean isReady = true;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);


        // Now focus on continue statement
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

    }
}
